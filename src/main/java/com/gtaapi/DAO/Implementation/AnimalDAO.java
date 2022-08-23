package com.gtaapi.DAO.Implementation;

import com.gtaapi.DAO.IAnimalDAO;
import com.gtaapi.Model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AnimalDAO implements IAnimalDAO {

    @Autowired
    private EntityManager entityManager;

    public Animal findById(long id) {
        return entityManager.find(Animal.class, id);
    }

    public List<Animal> findAll() {
        return entityManager.createNativeQuery("SELECT * FROM animals", Animal.class).getResultList();
    }

    public List<Animal> findByName(String name) {
        return entityManager.createNativeQuery("SELECT * FROM animals WHERE LOWER(name)='" + name + "'", Animal.class).getResultList();
    }
}
