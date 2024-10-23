package com.tazwar.cruddemo.controller;

import com.tazwar.cruddemo.exception.StudentNotFoundException;
import com.tazwar.cruddemo.model.StudentDAO;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<StudentDAO> studentDAOList;

    @PostConstruct
    public void loadData() {
        studentDAOList = new ArrayList<>();
        studentDAOList.add(new StudentDAO("Tazwar", "Mohammed0"));
        studentDAOList.add(new StudentDAO("Tazwar", "Mohammed1"));
        studentDAOList.add(new StudentDAO("Tazwar", "Mohammed2"));
        studentDAOList.add(new StudentDAO("Tazwar", "Mohammed3"));
        studentDAOList.add(new StudentDAO("Tazwar", "Mohammed4"));
    }

    @GetMapping("/students")
    public List<StudentDAO> getStudents() {
        return studentDAOList;
    }

    @GetMapping("/students/{studentId}")
    public StudentDAO getStudent(@PathVariable String studentId) {
        int id = Integer.parseInt(studentId);
        if (id >= studentDAOList.size()) {
            throw new StudentNotFoundException("Student not found for id: " + studentId, 404);
        }
        if (id < 0) {
            throw new StudentNotFoundException("Student ID can not be negative", 400);
        }
        return studentDAOList.get(id);
    }
}
