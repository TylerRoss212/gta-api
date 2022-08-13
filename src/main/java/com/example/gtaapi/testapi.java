package com.example.gtaapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testapi {

    @GetMapping("/hello")
    @CrossOrigin(origins = "http://localhost:4200")
    @ResponseBody
    public String getHello() {
        return "Hello";
    }
}
