package com.cpgi.Person.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cpgi.Person.bean.Employee;

public class EmployeeRepoImp implements  EmployeeRepoInterface{
   private Map<Integer,Employee> employees= new HashMap();
  
	@Override
	public boolean Save(Employee employee) {
	
		if(employees.containsKey(employee.getId()))
		{
			return false;
		}
		employees.put( employee.getId(), employee);
		return true;
		
	
	}

	@Override
	public List<Employee> FindByName(String name) {
		List<Employee> list= new ArrayList<>();
		Set<Map.Entry<Integer, Employee>> emps= employees.entrySet();
		for(Map.Entry<Integer, Employee> emp:emps)
		{
			if(emp.getValue().getName().equals(name))
			{
				list.add(emp.getValue());
			}
		}
		return list;
	}

}
