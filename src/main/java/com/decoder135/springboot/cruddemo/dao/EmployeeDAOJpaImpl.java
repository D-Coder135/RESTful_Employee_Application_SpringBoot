package com.decoder135.springboot.cruddemo.dao;

import com.decoder135.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{
    @Override
    public List<Employee> findAll() {
        return null;
    }
}
