package com.gtaapi.Service;

import com.gtaapi.DAO.Implementation.AnimalDAO;
import com.gtaapi.Model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AnimalService {

    @Autowired
    private AnimalDAO animalDAO;

    public Animal findById(long id) {
        return animalDAO.findById(id);
    }

    public List<Animal> findAll() {
        return animalDAO.findAll();
    }

    public List<Animal> findAllWithoutId() {
        List<Animal> animals = animalDAO.findAll();
        for (Animal animal : animals) {
            animal.setId(-1);
        }
        return animals;
    }
}
