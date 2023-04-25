package com.altice.labseq.controller.docs;


import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.NotNull;
import java.net.HttpURLConnection;
import java.util.List;

public interface SequenceControllerDocs {
    @Operation(summary = "Retrieve the sequence by number")
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Sequence was successfully retrieved"),
            @ApiResponse(code = 422, message = "Maybe there's a business error, e.g not filling the required parameters"),
            @ApiResponse(code = HttpURLConnection.HTTP_BAD_REQUEST, message = "Maybe there's an error with your request, e.g not filling the required parameters"),
            @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "I wasn't able to find what you needed"),
    })
    List<Integer> getSequenceByNumber(@NotNull @PathVariable int id);
}
