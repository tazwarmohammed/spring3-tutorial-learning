package com.tazwar.springboot.cruddemo.dao;

import com.tazwar.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    // write a function to find employee by name
    @Override
    public List<Employee> findByName(String name) {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee where name=:name", Employee.class);
        query.setParameter("name", name);
        return query.getResultList();
    }

    // write a function to dynamically find employee by name
    @Override
    public List<Employee> findByNameDynamic(String name) {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee where name like :name", Employee.class);
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }
    

    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public void deleteById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}
