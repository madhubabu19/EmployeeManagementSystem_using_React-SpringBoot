package com.mb.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {  // to transfeer the data between client and server EmployeeDto class
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
