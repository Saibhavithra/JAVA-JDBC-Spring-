package com.returnship.training;

public class Employee {
       /* int empId;
        String empName;
        int age;
        static String companyName;
	public String getEmpDetails() {
		return "Emp-Name:" + empName + "empId:" + empId +
				"age:" + age;*/
		
		 private int empId;
		 private   String empName;
		 private   int age;
	        static String companyName;
	   public Employee () {
		   System.out.println("Constuctor Called");
		   
	   }     
	   
	   public Employee(int empId,String empName, int age)
	   {this.empId = empId;
	   this.empName = empName;
	   this.age = age;
		   
	   }
	   public  int getEmpId() {
		   return this.empId;
	   }
	   
	   public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + "]";
	}

	public void setEmpId(int empId) {
		   this.empId = empId;
	   }
		public String getEmpDetails() {
			return "Emp-Name:" + empName + "empId:" + empId +
					"age:" + age;
	}
}
