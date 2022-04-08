package com.aaludra.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aaludra.employee.entity.EmployeeSalary; 

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeSalary, Long> {

}
