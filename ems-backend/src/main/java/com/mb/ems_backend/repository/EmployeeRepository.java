package com.mb.ems_backend.repository;

import com.mb.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee,Long> {
}
// place cursor on JpaRepository then press ctrl+B you will move to JpaRepository class