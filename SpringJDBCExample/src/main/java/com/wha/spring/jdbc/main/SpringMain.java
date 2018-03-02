package com.wha.spring.jdbc.main;

import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wha.spring.jdbc.dao.CrudDAO;
import com.wha.spring.jdbc.dao.EmployeeDAOImpl;
import com.wha.spring.jdbc.model.Employee;

public class SpringMain {

	public static void main(String[] args)
	{
		
		//create
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CrudDAO employeeDAO = ctx.getBean("employeeDAO", CrudDAO.class);
		Employee emp = new Employee();
		int rand = new Random().nextInt(1000);
		emp.setId(rand);
		emp.setName("Alexandra");
		emp.setRole("Dormeuse");
		
		//read
		employeeDAO.save(emp);
		Employee emp1 = employeeDAO.getById(rand);
		System.out.println("Employee retrived: " + emp1.getId());
		
		//update
		emp.setRole("Réveillée");
		employeeDAO.update(emp);

		//get all
		List<Employee> empList = employeeDAO.getAll();
		System.out.println(empList);
		System.out.println(emp.getName() + " " + emp.getRole());
		
		//delete
		employeeDAO.deleteById(rand);
		System.out.println("Delete competed");
		
		
		//employeeDAO = ctx.getBean("jdbcEmployeeDAO", CrudDAO.class);
		//employeeDAO.save(emp);
		
		//close Spring context
		
		ctx.close();
		
		
	}

}
