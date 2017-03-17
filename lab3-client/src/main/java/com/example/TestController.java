package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${lucky-word}")
    String keyword;

    @GetMapping("/luckyword")
    public String getWord() {
        return keyword;
    }

}
