package com.example.doublenumber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubleNumController {

    private static final String template = "Number - %s | Double - %s!";
    @GetMapping("/doubleNum")
    public int doubleNumber(@RequestParam(value = "number", defaultValue = "0" ) int number) {
        int doubleNum = number*2;
        return doubleNum;
    }
}