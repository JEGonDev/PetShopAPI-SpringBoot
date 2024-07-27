package com.PetShop.persistence.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "mascotas")  // Nombre de la tabla en la base de datos
public class Pets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet")
    private Integer petID;

    @Column(name = "nombres")
    private String name;

    @Column(name = "especies")
    private String species;

    @Column(name = "edad")
    private int age;

    @Column(name = "genero")
    private String gender;

    public Integer getID() {
        return petID;
    }

    public void setID(Integer ID) {
        this.petID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
