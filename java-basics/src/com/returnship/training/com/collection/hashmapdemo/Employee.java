package com.returnship.training.com.collection.hashmapdemo;


	import java.util.HashMap;
	import java.util.Map;

public	class Employee {
	    private Integer id;
	    private String name;
	    private String dept;

	    public Employee(Integer id, String name, String dept) {
	        this.id = id;
	        this.name = name;
	        this.dept = dept;
	    }

	    public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getdept() {
	        return dept;
	    }

	    public void setdept(String dept) {
	        this.dept = dept;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + name + '\'' +
	                ", dept='" + dept + '\'' +
	                '}';
	    }
}
	/*    for(Map.Entry<String, Integer> entry: myMap.entrySet()) {
			Sysout("key:"+entry.getKey(+"Value:"+entry.getValue))
		}
	   public void displaydept(int empId) {
	    for ( Map.Entry<Integer, Employee> entry:  employeesMap.entrySet()) {
      	  if(employee.getId() == empId) {
      	  System.out.println(employee.getid()+ " " +employee .getName()+ " " +employee.getdept());
      	  }
      	}
      
  }
	}*/

	

