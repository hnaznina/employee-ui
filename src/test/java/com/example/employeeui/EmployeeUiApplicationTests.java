package com.example.employeeui;

import com.example.employeeui.service.EmployeeService;
import com.example.employeeui.vo.Employee;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class EmployeeUiApplicationTests {
	@Autowired
	EmployeeService employeeService;

	static Employee employee;

	@BeforeClass
	public static void init(){
		employee = new Employee(1L, 30, "Atik", "Rahman");
	}

	@Test
	@Ignore
	public void contextLoads() {
	}

	@Test
	public void testGetEmployee(){

		List<Employee> employees = employeeService.getAllEmployee();
		log.info(employees);
		Assert.assertNotNull(employees);
		Assert.assertTrue(!employees.isEmpty());
		Assert.assertEquals("Atik",employees.get(0).getFirstName());

	}


	@Test
	public void testUpdateEmployee(){

		Boolean success = employeeService.updateEmployee(employee);
		log.info(success);

		Assert.assertTrue(success);

	}

	@Test
	@Ignore
	public void deleteEmployee(){

		Boolean success = employeeService.deleteEmployee(1L);
		log.info(success);

		Assert.assertTrue(success);

	}

	@Test
	public void addEmployee(){

		Boolean success = employeeService.insertEmployee(employee);
		log.info(success);

		Assert.assertTrue(success);

	}

}

