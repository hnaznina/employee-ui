package com.example.employeeui.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

    private Long id;

    private Integer age;

    @NotBlank(message = "First Name is mandatory")
    private String firstName;


    private String lastName;


}
