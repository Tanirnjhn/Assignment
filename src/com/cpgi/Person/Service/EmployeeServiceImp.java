package com.cpgi.Person.Service;

import java.util.List;

import com.cpgi.Person.Repository.EmployeeRepoImp;
import com.cpgi.Person.bean.Address;
import com.cpgi.Person.bean.Employee;

public class EmployeeServiceImp implements EmployeeServiceInterface  {
private EmployeeRepoImp repository;

	public EmployeeServiceImp(EmployeeRepoImp repository) {
	super();
	this.repository = repository;
}

	@Override
	public Employee CreateEmployee(int id, String name, Address address) {
		Employee employee= new Employee(id, name, address);
		if(repository.Save(employee))
		{
			return employee;
		}
		
	
		return null;
	}

	@Override
	public List<Employee> SearchByName(String name) {
		
		return repository.FindByName(name);
	}



}
