package com.mb.ems_backend.service;

import com.mb.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long EmployeeId);
    List<EmployeeDto> getAllEmployee();
    EmployeeDto updateEmployee(Long employeeId,EmployeeDto updatedEmployee);
    void deleteEmployee(Long employeeId);

}
