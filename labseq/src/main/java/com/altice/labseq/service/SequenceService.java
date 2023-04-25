package com.altice.labseq.service;

import com.altice.labseq.core.logs.LogEvent;
import com.altice.labseq.core.logs.LogType;
import com.altice.labseq.core.logs.LoggerUtils;
import com.altice.labseq.repository.SequenceRepository;
import com.altice.labseq.repository.model.DataSequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @author Antonio Salviano Soares Júnior
 */
@Service
public class SequenceService {

    @Autowired
    private SequenceRepository repository;
    private static final Logger SEQUENCE_LOGGER = LoggerFactory.getLogger(SequenceService.class);

    public List<Integer> executeSequence(int refNumber) {

        int index = 0;
        List<Integer> sequence = new ArrayList<>();

        //Verifying if data exist in cache:
        Iterable<DataSequence> dataSequenceIterable = () -> repository.findAll().iterator();
        Stream<DataSequence> targetStream = StreamSupport.stream(dataSequenceIterable.spliterator(), false);
        DataSequence existentDataSequence = targetStream
                .sorted(Comparator.comparingInt(DataSequence::getNumber))
                .reduce((minor, current) -> {
            return (current.getNumber() <= refNumber &&(minor.getNumber() < refNumber
                    || current.getNumber() > minor.getNumber()))
                    ? current : minor;
        }).stream().findFirst().orElse(null);

        //If already exist return
        if(Objects.nonNull(existentDataSequence)) {
            if(existentDataSequence.getNumber() == refNumber){
                return existentDataSequence.getSequence();
            }else {
                sequence.addAll(existentDataSequence.getSequence());
                index = existentDataSequence.getNumber();
            }
        }

        //Start sequence calc
        LoggerUtils.info(SEQUENCE_LOGGER, LogEvent.GENERATE_SEQUENCE, LogType.BUSINESS,
                ": Generating sequence of number {}", refNumber);
        long startTime  = System.currentTimeMillis();
        IntStream.range(index, refNumber)
                .forEach(i -> {
                    if(refNumber >= 0 && refNumber <=3) {
                        sequence.add(returnZeroOrOne(refNumber));
                    } else {
                        sequence.add(calcSequence(i));
                    }
                });
        long endTime = System.currentTimeMillis();
        String strTime =  String.format("%.3f ms%n", (endTime - startTime) / 1000d);

        LoggerUtils.info(SEQUENCE_LOGGER, LogEvent.GENERATE_SEQUENCE, LogType.BUSINESS,
                ": Finalizing" +
                        " sequence of number {} | Total processing time: {}", refNumber, strTime);

        if(!CollectionUtils.isEmpty(sequence)){
            DataSequence dataSequence = DataSequence.builder()
                    .number(refNumber)
                    .sequence(sequence)
                    .build();
            repository.save(dataSequence);
        }

        return sequence;
    }

    public int calcSequence(int number) {
        if(number >= 0 && number <=3) {
            return returnZeroOrOne(number);
        } else {
            return getResult(number);
        }
    }
    private int getResult(int number) {
        int num1 = calcSequence(number - 4);
        int num2 = calcSequence(number - 3);
        int result = num1 + num2;
        return result;
    }
    public int returnZeroOrOne(int n){
        if (n == 0 || n == 2) {
            return 0;
        } else if (n == 1 || n == 3) {
            return 1;
        }
        return n;
    }
}
