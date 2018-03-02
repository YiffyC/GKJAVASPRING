package com.wha.spring.jdbc.dao;

import java.util.List;
import com.wha.spring.jdbc.model.Employee;

public interface CrudDAO 
{
	public void save(Employee emploee); //méthode abstraite
	public Employee getById(int id);
	public void update(Employee employee);
	public void deleteById(int id);
	public List<Employee> getAll();
	
}
