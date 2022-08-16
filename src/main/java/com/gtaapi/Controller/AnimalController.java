package com.gtaapi.Controller;

import com.gtaapi.Model.Animal;
import com.gtaapi.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/api/animals/findById/{id}")
    public ResponseEntity<Animal> findById(@PathVariable long id) {
        return new ResponseEntity<>(animalService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/api/animals/findAll")
    public ResponseEntity<List<Animal>> findAll() {
        return new ResponseEntity<>(animalService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/api/animals/findAllWithoutId")
    public ResponseEntity<List<Animal>> findAllWithoutId() {
        return new ResponseEntity<>(animalService.findAllWithoutId(), HttpStatus.OK);
    }
}
