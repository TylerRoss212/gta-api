package com.gtaapi;

import com.gtaapi.config.AppConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class testapi {

    @GetMapping("/api/hello")
    public String getHello() {
        return "Hello";
    }
}
