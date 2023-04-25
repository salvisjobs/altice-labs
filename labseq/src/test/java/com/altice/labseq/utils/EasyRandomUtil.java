package com.altice.labseq.utils;

import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

import java.time.LocalDate;
import java.time.Month;

/**
 * Create a parameterized Easy Random instance
 * <p>
 * See documentation here: https://www.baeldung.com/java-easy-random
 *
 * @author Antonio Salviano Soares Júnior
 */
public class EasyRandomUtil {

    public static EasyRandom getInstance() {
        EasyRandomParameters parameters = new EasyRandomParameters();
        parameters.stringLengthRange(1, 10);
        parameters.dateRange(LocalDate.of(2000, Month.JANUARY, 1), LocalDate.now());
        parameters.collectionSizeRange(1, 5);
        return new EasyRandom(parameters);
    }

}
