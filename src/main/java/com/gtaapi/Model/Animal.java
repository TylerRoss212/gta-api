package com.gtaapi.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue
    @Column(unique = true)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String classification;
}
