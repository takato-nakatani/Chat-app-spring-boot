package com.spring.tktapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TimeController {

    @RequestMapping("/api/time")
    public Map<String, String> index() {
        Map<String, String> response = new HashMap<>();
        response.put("date", new Date().toString());
        return response;
    }
}
