package com.returnship.training.collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

	public class Collectiontest1 {

		public static void main(String[] args) {
			
			Set <Employee1>employeeset=new HashSet<>();

			 employeeset.add(new Employee1("karlmax",new Date(18,11,2020),"pr.Manager", 10000.00 , "Production" ,1));
			 employeeset.add(new Employee1("keitein",new Date(18,11,2020),"Developer", 50000.00 , "Development",2));
			 employeeset.add(new Employee1("kasmiri",new Date(18,11,2020),"Tester", 30000.00 , "Testing",3));
			 employeeset.add(new Employee1("kavinaa",new Date(18,11,2020),"Sr.Tester", 40000.00 , "Testing",3));
			 employeeset.add(new Employee1("karishma",new Date(18,11,2020),"Sr.Developer", 60000.00 , "Production",1));
			 employeeset.add(new Employee1("kalinthi",new Date(18,11,2020),"Pr.Manager", 70000.00 , "Production",1));	
			 employeeset.add(new Employee1("kalinthi",new Date(18,11,2020),"Pr.Manager", 70000.00 , "Production",1));
			 employeeset.add(new Employee1("karishma",new Date(18,11,2020),"Sr.Developer", 60000.00 , "Production",1));


		
			Set<Employee1> Productionemployeeset = new HashSet<>();
			Set<Employee1> Developmentemployeeset = new HashSet<>();
			Set<Employee1> Testingemployeeset = new HashSet<>();

			
			for (Employee1 employee : employeeset) {
	
			if (employee.getDeptName().equalsIgnoreCase("Production")) {
				Productionemployeeset.add(employee);
				
				
			} else if (employee.getDeptName().equalsIgnoreCase("Development")) {
				Developmentemployeeset.add(employee);
				
				
			} else if (employee.getDeptName().equalsIgnoreCase("Testing")) {
				Testingemployeeset.add(employee);
							
			}
						
			}
			
			System.out.println("Production Department: ");
			for (Employee1 productionemployee:Productionemployeeset)
			{	 System.out.println(productionemployee);
		 }
			System.out.println("Development Department:" );
			for (Employee1 developmentemployee:Developmentemployeeset)
			{	 System.out.println(developmentemployee);
		 }
			System.out.println("Testing Department: ");
			for (Employee1 Testingemployee:Testingemployeeset)
			{	 System.out.println(Testingemployee);
		 }
		
		}
			 }	
	 
	            
