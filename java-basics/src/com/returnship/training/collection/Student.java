package com.returnship.training.collection;

import java.util.Objects;

public class Student implements Comparable<Student>{
 private String name;
 private int age;
 private String grade;
 private int StudId;
 
/*@Override
public int hashCode() {
	//return Objects.hash(StudId, age, grade, name);
	return this.StudId;
}*/




public int getStudId() {
	return StudId;
}

public void setStudId(int studId) {
	StudId = studId;
}




public Student (String name, int age, String grade) {
	super();
	this.name =name;
	this.age =age;
	this.grade=grade;
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

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
}



@Override
public int hashCode() {
	return this.StudId;
}



@Override
public int compareTo(Student o) {
	//return this.name.compareTO(o.name);
	if(this.age>o.age) {
		return 1;
	}
	else if (this.age< o.age) {
		return -1;
	}
	else {return 0;}
}



	
}
