package com.returnship.training.collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Collectiontest {
	public static void main(String[] args) {
	/*	 Set<Employee> employeeSet = new HashSet<>();
		 Set<Productionemployee> ProductionemployeeSet = new HashSet<>();
		 Set<Testingemployee> TestingemployeeSet = new HashSet<>();
		 Set<Developmentemployee> DevelopmentemployeeSet = new HashSet<>();*/
		 
		Set<Employee> employeeset = new HashSet<>();
		/* Set<Employee>  ProductionemployeeSet = new HashSet<>();
		 Set<Employee>  TestingemployeeSet = new HashSet<>();
		 Set<Employee>  DevelopmentemployeeSet = new HashSet<>();*/
	
		 employeeset.add(new Employee("karlmax",new Date(18,11,2020),"pr.Manager", 10000.00 , "Production" ,1));
		 employeeset.add(new Employee("keitein",new Date(18,11,2020),"Developer", 50000.00 , "Development",2));
		 employeeset.add(new Employee("kasmiri",new Date(18,11,2020),"Tester", 30000.00 , "Testing",3));
		 employeeset.add(new Employee("kavinaa",new Date(18,11,2020),"Sr.Tester", 40000.00 , "Testing",3));
		 employeeset.add(new Employee("karishma",new Date(18,11,2020),"Sr.Developer", 60000.00 , "Production",1));
		 employeeset.add(new Employee("kalinthi",new Date(18,11,2020),"Pr.Manager", 70000.00 , "Production",1));	
		 employeeset.add(new Employee("kalinthi",new Date(18,11,2020),"Pr.Manager", 70000.00 , "Production",1));
		 employeeset.add(new Employee("karishma",new Date(18,11,2020),"Sr.Developer", 60000.00 , "Production",1));

for (Employee employee:employeeset)
{
	 System.out.println(employee);
}

  
	}}



