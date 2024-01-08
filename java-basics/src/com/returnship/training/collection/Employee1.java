package com.returnship.training.collection;

import java.util.Date;
import java.util.Objects;

public class Employee1 {
	
	
		private String name;
		private  Date joiningdate;
		private String designation ;
		private double salary;
		private int deptId;

		private  String deptName;

		public Employee1(String name,Date joiningdate,String designation ,double salary,String deptName,int deptId) {
			super();
			this.name =name;
			this.joiningdate = joiningdate;
			this.designation =designation;
			this.salary = salary;
			this.deptName= deptName;
			this.deptId= deptId;
		}
	
		@Override
		public String toString() {
			return "Employee1 [name=" + name + ", joiningdate=" + joiningdate + ", designation=" + designation
					+ ", salary=" + salary + ", deptName=" + deptName + "]";
		}
		
		
		@Override
		public int hashCode() {
			return deptId;
		}



		@Override
		public boolean equals(Object obj) {

			
			Employee1 other = (Employee1) obj;
			return deptId == other.deptId && Objects.equals(deptName, other.deptName)
					&& Objects.equals(designation, other.designation) && Objects.equals(joiningdate, other.joiningdate)
					&& Objects.equals(name, other.name)&& salary == other.salary;
					//&& java.lang.Double.doubleToLongBits(salary) == java.lang.Double.doubleToLongBits(other.salary);
			
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

}