package com.returnship.training.collection;

import java.util.Date;

public class Productionemployee {
	private String name;
	private  Date joiningdate;
	private String designation ;
	private double salary;
	private  String deptName;

	public Productionemployee(String name,Date joiningdate,String designation ,double salary,String deptName) {
		super();
		this.name =name;
		this.joiningdate = joiningdate;
		this.designation =designation;
		this.salary = salary;
		this.deptName= deptName;
	}

	

	@Override
	public String toString() {
		return "Productionemployee [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
				+ ", salary=" + salary + ", deptName=" + deptName + "]";
	}



	public String getName() {
		return name;
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
}
