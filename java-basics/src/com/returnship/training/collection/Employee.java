package com.returnship.training.collection;
import java.util.*;

//
//Create a set of Employee with name, joining date, designation and salary. 
//filter your original set and get the employees department wise and save them in separate sets.
public class Employee {
private String name;
private  Date joiningdate;
private String designation ;
private double salary;
private int deptId;

private  String deptName;

public Employee(String name,Date joiningdate,String designation ,double salary,String deptName,int deptId) {
	super();
	this.name =name;
	this.joiningdate = joiningdate;
	this.designation =designation;
	this.salary = salary;
	this.deptName= deptName;
	this.deptId= deptId;
}

public Employee(int i, String string, String string2, Date hireDate, double d) {
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}


public int getDeptId() {
	return deptId;
}

public void setDeptId(int deptId) {
	this.deptId = deptId;
}

public void setName(String name) {
	this.name = name;
}
public Date getJoiningdate() {
	return joiningdate;
}
public void setJoiningdate(Date joiningdate) {
	this.joiningdate = joiningdate;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}



@Override
public int hashCode() {
	return deptId;
}





@Override
public boolean equals(Object obj) {

	
	Employee other = (Employee) obj;
	return deptId == other.deptId && Objects.equals(deptName, other.deptName)
			&& Objects.equals(designation, other.designation) && Objects.equals(joiningdate, other.joiningdate)
			&& Objects.equals(name, other.name)&& salary == other.salary;
			//&& java.lang.Double.doubleToLongBits(salary) == java.lang.Double.doubleToLongBits(other.salary);
	
}

public String toString() {
	if (deptName.equalsIgnoreCase("Production"))
	{
	Set<Employee> Productionemployeeset = new HashSet<>();
		
		Productionemployeeset.add(new Employee(name, joiningdate, deptName, salary, deptName,deptId));
		Set<Productionemployee> ProductionemployeeSet = new HashSet<>();
		// Set<Employee> Productionemployeeset = new HashSet<>();
		// ProductionemployeeSet.add(new Employee (name, joiningdate, deptName, salary, deptName));
	    for (Employee productionemployee:Productionemployeeset)
		{	 System.out.println(productionemployee);
	 }
		 
		//return "Productionemployee [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
				//+ ", salary=" + salary + ", deptName=" + deptName + "]";
	 }
	else if (deptName.equalsIgnoreCase("Testing"))
	{
		Set<Employee> TestingemployeeSet = new HashSet<>();
		
		 TestingemployeeSet.add(new Employee(name, joiningdate, deptName, salary, deptName,deptId));
		// for (Employee testingemployee:TestingemployeeSet)
		// {
		// 	 System.out.println(testingemployee);
		// }
		// return "Testingemployee [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
			//		+ ", salary=" + salary + ", deptName=" + deptName + "]";

	 }  
	else if (deptName.equalsIgnoreCase("Development"))
	{
		// Set<Developmentemployee> DevelopmentemployeeSet = new HashSet<>();
	//	 Set<Employee> DevelopmentemployeeSet = new HashSet<>();
	//	 DevelopmentemployeeSet.add(new Employee(name, joiningdate, deptName, salary, deptName,deptId));
	//	 for (Employee developmentemployee:DevelopmentemployeeSet)
	//	 {
	//	 	 System.out.println(developmentemployee);
	//	 }
		// return "Developmentemployee [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
				//	+ ", salary=" + salary + ", deptName=" + deptName + "]";
			
	 }  
	//return "employee [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
		//	+ ", salary=" + salary + ", deptName=" + deptName + "]";

	return "";
	
	}

}



/*package com.returnship.training.collection;
import java.util.*;

//
//Create a set of Employee with name, joining date, designation and salary. 
//filter your original set and get the employees department wise and save them in separate sets.
public class Employee {
private String name;
private  Date joiningdate;
private String designation ;
private double salary;
private int deptId;

private  String deptName;

public Employee(String name,Date joiningdate,String designation ,double salary,String deptName,int deptId) {
	super();
	this.name =name;
	this.joiningdate = joiningdate;
	this.designation =designation;
	this.salary = salary;
	this.deptName= deptName;
	this.deptId= deptId;
}

public String getName() {
	return name;
}


public int getDeptId() {
	return deptId;
}

public void setDeptId(int deptId) {
	this.deptId = deptId;
}

public void setName(String name) {
	this.name = name;
}
public Date getJoiningdate() {
	return joiningdate;
}
public void setJoiningdate(Date joiningdate) {
	this.joiningdate = joiningdate;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}



@Override
public int hashCode() {
	return deptId;
}

@Override
public boolean equals(Object obj) {

	
	Employee other = (Employee) obj;
	return deptId == other.deptId && Objects.equals(deptName, other.deptName)
			&& Objects.equals(designation, other.designation) && Objects.equals(joiningdate, other.joiningdate)
			&& Objects.equals(name, other.name)&& salary == other.salary;
			//&& java.lang.Double.doubleToLongBits(salary) == java.lang.Double.doubleToLongBits(other.salary);
	
}

public String toString() {
	if (deptName.equalsIgnoreCase("Production"))
	{
		Set<Productionemployee> ProductionemployeeSet = new HashSet<>();
		
		 ProductionemployeeSet.add(new Productionemployee(name, joiningdate, deptName, salary, deptName));
		//Set<Employee> Productionemployeeset = new HashSet<>();
		
		//Productionemployeeset.add(new Employee(name, joiningdate, deptName, salary, deptName,deptId));
		for (Productionemployee productionemployee:ProductionemployeeSet)
		 {
			 System.out.println(productionemployee);
		 }
		 
		//return "Productionemployee [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
				//	+ ", salary=" + salary + ", deptName=" + deptName + "]";
	 }
	else if (deptName.equalsIgnoreCase("Testing"))
	{
		
		Set<Testingemployee> TestingemployeeSet = new HashSet<>();
	
	 TestingemployeeSet.add(new Testingemployee(name, joiningdate, deptName, salary, deptName));
		//Set<Employee> Testingemployeeset = new HashSet<>();
			
	//	Testingemployeeset.add(new Employee(name, joiningdate, deptName, salary, deptName,deptId));
		 for (Testingemployee Testingemployee:TestingemployeeSet)
		 {
		 	 System.out.println(Testingemployee);
		 }
		// return "Testingemployee [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
			//		+ ", salary=" + salary + ", deptName=" + deptName + "]";

	 }  
	else if (deptName.equalsIgnoreCase("Development"))
	{      
		 //Set<Employee> DevelopmentemployeeSet = new HashSet<>();
		Set<Developmentemployee> DevelopmentemployeeSet = new HashSet<>();
		 DevelopmentemployeeSet.add(new Developmentemployee(name, joiningdate, deptName, salary, deptName));
		 for (Developmentemployee developmentemployee:DevelopmentemployeeSet)
		 {
		 	 System.out.println(developmentemployee);
		 }
		// return "Developmentemployee [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
				//	+ ", salary=" + salary + ", deptName=" + deptName + "]";
			
	 }  
	return "employee [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
		+ ", salary=" + salary + ", deptName=" + deptName + "]";
	
	}

}*/


