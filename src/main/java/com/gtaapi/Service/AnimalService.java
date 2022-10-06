package com.gtaapi.Service;

import com.gtaapi.DAO.Implementation.AnimalDAO;
import com.gtaapi.Model.Animal;
import com.gtaapi.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

@Service
public class AnimalService {

    @Autowired
    private AnimalDAO animalDAO;

    @Autowired
    private AppConfig appConfig;

    public Long getNumber() {
        // return the number of days between now and the start date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate ldt = LocalDate.parse(appConfig.getStartDate(), dtf);
        LocalDate ldt1 = LocalDate.now(ZoneId.of(appConfig.getZone()));
        return ldt.until(ldt1, ChronoUnit.DAYS);
    }

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

    public Animal findByName(String name) {
        if (name.length() > 100) {
            return null;
        }
        name.replace("'", "''");
        List<Animal> animals = animalDAO.findByName(name);
        if (animals.size() >  0) {
            return animals.get(0);
        } else {
            return null;
        }
    }
}
