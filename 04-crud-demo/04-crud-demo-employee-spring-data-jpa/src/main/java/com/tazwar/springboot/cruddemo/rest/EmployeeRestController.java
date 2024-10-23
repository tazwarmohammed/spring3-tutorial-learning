//package com.tazwar.springboot.cruddemo.rest;
//
//import com.tazwar.springboot.cruddemo.entity.Employee;
//import com.tazwar.springboot.cruddemo.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class EmployeeRestController {
//
//    private final EmployeeService employeeService;
//
//    @Autowired
//    public EmployeeRestController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/employees")
//    public List<Employee> getAllEmployees() {
//        return employeeService.findAll();
//    }
//
//    @GetMapping("/employees/{employeeId}")
//    public Employee getEmployee(@PathVariable int employeeId) {
//
//        Employee employee = employeeService.findById(employeeId);
//        if (employee == null) throw new RuntimeException("Employee ID not found >> :: " + employeeId);
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addEmployee(@RequestBody Employee employee) {
//        employee.setId(0);
//        return employeeService.save(employee);
//    }
//
//    @PostMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        return employeeService.save(employee);
//    }
//
//    @DeleteMapping("/employees/{employeeId}")
//    public String deleteEmployee(@PathVariable int employeeId) {
//        Employee employee = employeeService.findById(employeeId);
//        if (employee == null) throw new RuntimeException("Employee ID not found >> :: " + employeeId);
//        employeeService.deleteById(employeeId);
//        return "Deleted employee ID >> :: " + employeeId;
//    }
//}
