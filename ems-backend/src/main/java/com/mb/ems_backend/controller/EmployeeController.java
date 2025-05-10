package com.mb.ems_backend.controller;

import com.mb.ems_backend.dto.EmployeeDto;
import com.mb.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@AllArgsConstructor

@RestController//  this class becomes a sp-ring mvc rest controller this class capable to han dle http request
@RequestMapping ("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //Build Add Employee Rest Api
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto)
    {
       EmployeeDto savedEmployee =  employeeService.createEmployee(employeeDto);
       return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    //Build Get Employee Rest Api
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }
    // Build Get All Employees Rest Api
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees=employeeService.getAllEmployee();
        return ResponseEntity.ok(employees);
    }
    //Build Update  Employee Rest Api
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployee)
    {
       EmployeeDto employeeDto =  employeeService.updateEmployee(employeeId,updatedEmployee);
       return ResponseEntity.ok(employeeDto);
    }
    //Build Delete Employee Rest Api
    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId)
    {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("employee deleted successfully");
    }
}
