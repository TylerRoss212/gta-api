package com.gtaapi.DAO;

import com.gtaapi.Model.Animal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAnimalDAO {

    public Animal findById(long id);

    public List<Animal> findAll();

    public List<Animal> findByName(String name);
}
