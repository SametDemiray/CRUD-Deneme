package com.backend.crud.deneme.repository;

import com.backend.crud.deneme.entities.model.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@Repository
@Transactional
public class EmployeeRepository {

    @Autowired
    EmployeeRepo repo;

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody Employee employee) {

        repo.save(employee);

    }

    @DeleteMapping("/deleteEmployee")
    public void deleteEmployee(@RequestBody Employee employee) {

      repo.deleteById(employee);

    }

}
