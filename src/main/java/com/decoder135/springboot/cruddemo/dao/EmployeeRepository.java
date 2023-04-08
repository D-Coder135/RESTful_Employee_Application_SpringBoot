package com.decoder135.springboot.cruddemo.dao;

import com.decoder135.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring provides an annotation for the changing the default endpoint i.e, in this case "/employees"

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it....no need to write any code LOL!
}
