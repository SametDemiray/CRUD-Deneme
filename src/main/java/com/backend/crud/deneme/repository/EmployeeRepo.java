package com.backend.crud.deneme.repository;

import com.backend.crud.deneme.entities.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
//@Repository gerekli mi ?
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteById(Employee employee);
}
