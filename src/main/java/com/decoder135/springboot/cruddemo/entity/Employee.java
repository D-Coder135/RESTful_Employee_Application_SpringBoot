package com.decoder135.springboot.cruddemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    // define fields
    @Id
    private int id;

    private String firstName;

    private String lastName;

    private String email;

    // define constructor

    // define getter/setter

    // define toString

}
