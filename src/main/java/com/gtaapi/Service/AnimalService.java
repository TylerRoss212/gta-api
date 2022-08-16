package com.gtaapi.Service;

import com.gtaapi.DAO.Implementation.AnimalDAO;
import com.gtaapi.Model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
