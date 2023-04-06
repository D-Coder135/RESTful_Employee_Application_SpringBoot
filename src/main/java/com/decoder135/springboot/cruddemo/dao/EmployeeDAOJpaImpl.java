package com.decoder135.springboot.cruddemo.dao;

import com.decoder135.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    // define field for entitymanager

    // set up constructor injection

    @Override
    public List<Employee> findAll() {
        return null;
    }
}
