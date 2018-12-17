package com.example.employeeui.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    private Long id;

    private Integer age;


    private String firstName;


    private String lastName;


}
