package com.example.doublenumber;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubleNumController {
    @RequestMapping("/doubleNum")
    public int doubleNumber(@RequestParam(value = "number", defaultValue = "0" ) int number) {
        return number*2;
    }
}