package com.aaludra.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aaludra.employee.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}