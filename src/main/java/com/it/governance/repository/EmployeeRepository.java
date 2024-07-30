package com.it.governance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.governance.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
