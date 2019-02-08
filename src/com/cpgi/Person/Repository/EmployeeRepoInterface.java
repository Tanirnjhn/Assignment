package com.cpgi.Person.Repository;

import java.util.List;

import com.cpgi.Person.bean.Employee;

public interface EmployeeRepoInterface {
boolean Save(Employee employee);
List<Employee>FindByName(String name);
}
