package com.altice.labseq.repository;

import com.altice.labseq.repository.model.DataSequence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Antonio Salviano Soares Júnior
 */
@Repository
public interface SequenceRepository extends CrudRepository<DataSequence, Integer> {

    Optional<DataSequence> getDataSequenceByNumber(int refNumber);

}
