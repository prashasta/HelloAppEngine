package com.mw.example.HelloAppEngine.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;

@RestController
public class DummyRestController {

    @GetMapping("/")
    public String hello() {
        return "YAY...Hello from Spring Boot at App Engine deployed using Container Builder with Github integration on code push !!";
    }

    @GetMapping("/time")
    public String time() {
        //return Calendar.getInstance().getTime().toString();
        return LocalDateTime.now(ZoneId.of("CST6CDT")).toString();
    }

}
