package com.tazwar.springboot.cruddemo.dao;

import com.tazwar.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
