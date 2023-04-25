package com.altice.labseq.controller;

import com.altice.labseq.controller.docs.SequenceControllerDocs;
import com.altice.labseq.service.SequenceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Antonio Salviano Soares Júnior
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/labseq")
public class SequenceController implements SequenceControllerDocs {
    @Autowired
    private SequenceService service;

    @Override
    @CrossOrigin
    @GetMapping("/{n}" )
    public List<Integer> getSequenceByNumber(@PathVariable int n) {
        log.info("Entered find sequence by number");
        List<Integer> result = service.executeSequence(n);
        log.info("Sequence found with number: {}", n);
        return result;
    }
}
