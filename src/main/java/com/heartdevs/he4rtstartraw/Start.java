package com.heartdevs.he4rtstartraw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Start {

    @GetMapping
    public String home() {
        return "Oi, tá rodando";
    }
}
