package com.cpgi.Person.Service;

import java.util.List;

import com.cpgi.Person.bean.Address;
import com.cpgi.Person.bean.Employee;

public interface EmployeeServiceInterface {
Employee CreateEmployee( int id, String name,Address address);
	List<Employee>SearchByName(String name);



}
