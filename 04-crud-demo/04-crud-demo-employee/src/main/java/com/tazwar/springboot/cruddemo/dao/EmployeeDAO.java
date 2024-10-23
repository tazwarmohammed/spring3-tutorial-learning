package com.tazwar.springboot.cruddemo.dao;

import com.tazwar.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int id);
    List<Employee> findByName(String name); // Add this line
    Employee save(Employee employee);
    void deleteById(int id);
}
