package com.backend.crud.deneme.service;

import com.backend.crud.deneme.entities.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllId();
    void save(long id);
    void delete(long id);
    void getAll(long id);
}
