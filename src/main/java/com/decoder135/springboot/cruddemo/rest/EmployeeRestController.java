package com.decoder135.springboot.cruddemo.rest;

import com.decoder135.springboot.cruddemo.dao.EmployeeDAO;
import com.decoder135.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    // quick and dirty: inject employee dao(use constructor injection)

    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }


    // expose "/employees" and return a list of employees
    public List<Employee> findAll() {

    }

}
