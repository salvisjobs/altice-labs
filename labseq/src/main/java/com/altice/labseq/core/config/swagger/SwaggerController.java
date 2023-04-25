package com.altice.labseq.core.config.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerController {

    @GetMapping("/")
    public String index() {
        return "redirect:/swagger-ui/index.html";
    }

}
