package com.gtaapi.Controller;

import com.gtaapi.Model.Animal;
import com.gtaapi.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/api/animals/getNumber")
    public Long getNumber() {
        return animalService.getNumber();
    }

    @GetMapping("/api/animals/findById/{id}")
    public Animal findById(@PathVariable long id) {
        return animalService.findById(id);
    }

    @GetMapping("/api/animals/findAll")
    public List<Animal> findAll() {
        return animalService.findAll();
    }

    @GetMapping("/api/animals/findAllWithoutId")
    public List<Animal> findAllWithoutId() {
        return animalService.findAllWithoutId();
    }

    @PostMapping("/api/animals/findByName")
    public Animal findByName(@RequestBody String name) {
        return animalService.findByName(name);
    }
}
