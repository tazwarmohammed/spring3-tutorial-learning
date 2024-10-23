//package com.tazwar.springboot.cruddemo.service;
//
//import com.tazwar.springboot.cruddemo.dao.EmployeeRepository;
//import com.tazwar.springboot.cruddemo.entity.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    private EmployeeRepository employeeRepository;
//
//    @Autowired
//    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee findById(int id) {
//        Optional <Employee> employee = employeeRepository.findById(id);
//        if (employee.isPresent()) {
//            return employee.get();
//        }
//        throw new RuntimeException("Employee not found wih id >> :: " + id);
//    }
//
//    @Override
//    public Employee save(Employee employee) {
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    public void deleteById(int id) {
//        employeeRepository.deleteById(id);
//    }
//}
