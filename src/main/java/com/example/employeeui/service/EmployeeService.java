package com.example.employeeui.service;

import com.example.employeeui.vo.Employee;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeService {

    RestTemplate restTemplate = new RestTemplate();

    public List<Employee> getAllEmployee(){

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");

        HttpEntity entity = new HttpEntity(headers);
        String url = "http://localhost:8081/employee-service/employee";

        ResponseEntity<List<Employee>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<List<Employee>>(){});

        return response.getBody();
    }

    public Boolean updateEmployee(Employee employee){

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set("Content-Type", "application/json");

        HttpEntity entity = new HttpEntity<Employee>(employee, headers);
        String url = "http://localhost:8081/employee-service//employee/" + employee.getId();

        ResponseEntity response = restTemplate.exchange(
                url,
                HttpMethod.PUT,
                entity,
                Object.class);

        return true;
    }

    public Boolean deleteEmployee(Long id){

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");

        HttpEntity entity = new HttpEntity<Employee>(headers);
        String url = "http://localhost:8081/employee-service//employee/" + id;

        ResponseEntity response = restTemplate.exchange(
                url,
                HttpMethod.DELETE,
                entity,
                Object.class);

        return true;
    }

    public Boolean insertEmployee(Employee employee){

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        headers.set("Content-Type", "application/json");

        HttpEntity entity = new HttpEntity<Employee>(employee, headers);
        String url = "http://localhost:8081/employee-service//employee";

        ResponseEntity response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                entity,
                Object.class);

        return true;
    }

}
