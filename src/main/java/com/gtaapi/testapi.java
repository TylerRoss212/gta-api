package com.gtaapi;

import com.gtaapi.config.AppConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class testapi {

    private final AppConfig appConfig;

    @GetMapping("/api/hello")
    public Person getHello() {
        Person person = new Person();
        person.setId(1L);
        person.setName("Tyler");
        return person;
    }
}
