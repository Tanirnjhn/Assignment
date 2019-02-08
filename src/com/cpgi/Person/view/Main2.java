package com.cpgi.Person.view;

import com.cpgi.Person.Repository.EmployeeRepoImp;
import com.cpgi.Person.Service.EmployeeServiceImp;
import com.cpgi.Person.Service.EmployeeServiceInterface;
import com.cpgi.Person.bean.Address;
import com.cpgi.Person.bean.City;
import com.cpgi.Person.bean.Country;

public class Main2 {

	public static void main(String[] args) {
		
       EmployeeServiceInterface service= new EmployeeServiceImp(new  EmployeeRepoImp());
       City city=new City();
       city.setName("Pune");
       Country country= new Country();
       country.setName("India");
       country.setCity(city);
       Address address= new Address();
       address.setAddressLine("XYZ");
       address.setCountry(country);
       
       
     System.out.println(service.CreateEmployee(100, "Taneesha", address));
       System.out.println(service.CreateEmployee(101, "Shivi", new Address("Chowk",new Country("India", new City("Pune")))));
      
       
       
       
	}

}
