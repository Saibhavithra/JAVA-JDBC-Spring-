package com.returnship.training.jdbc;


public class Person {
	
	
	    private String name;
	    private int age;
	    

	    @Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}

		public Person(String name, int age) {
	       
	        this.name = name;
	        this.age = age;
	    }

	public Person() {
			// TODO Auto-generated constructor stub
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	

	

}
