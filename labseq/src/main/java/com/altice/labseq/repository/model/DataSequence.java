package com.altice.labseq.repository.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * @author Antonio Salviano Soares Júnior
 */
@RedisHash("dataSequence")
@Getter
@Builder
public class DataSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private List<Integer> sequence;

}
