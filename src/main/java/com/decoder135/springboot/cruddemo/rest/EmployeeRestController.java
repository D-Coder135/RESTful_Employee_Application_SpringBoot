package com.decoder135.springboot.cruddemo.rest;

import com.decoder135.springboot.cruddemo.dao.EmployeeDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;
    // quick and dirty: inject employee dao

    // expose "/employees" and return a list of employees

}
