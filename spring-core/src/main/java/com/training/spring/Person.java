

/*import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
public class Person {
private String firstName;
private String lastName;
private int age;


@Autowired
private Car myCar;

/*public Person() {}*/

//2public Person(int age) {
//2	this.age=age;
//2}
/*public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


public Car getMyCar() {
	return myCar;
}

public void setMyCar(Car myCar) {
	this.myCar = myCar;
}*/

//2public Person() {
	// TODO Auto-generated constructor stub
//2}

//2public String getPersonDetails() {
//2	return this.firstName+ myCar.getCarDetails();
//2}

//2}/*

package com.training.spring;
import org.springframework.beans.factory.annotation.Autowired;



import lombok.Data;
import lombok.NoArgsConstructor;
@Data //to skip getters and setter
@NoArgsConstructor//  to skip default constructor
public class Person {
private String firstName;
private String lastName;
private int age;
 
@Autowired
private Car myCar;

public Person(int age) {
	this.age=age;
}
//public String getFirstName() {
//	return firstName;
//}
//public void setFirstName(String firstName) {
//	this.firstName = firstName;
//}
//public String getLastName() {
//	return lastName;
//}
//public void setLastName(String lastName) {
//	this.lastName = lastName;
//}
//public int getAge() {
//	return age;
//}
//public void setAge(int age) {
//	this.age = age;
//}
// 
// 
//public Car getMyCar() {
//	return myCar;
//}
// 
//public void setMyCar(Car myCar) {
//	this.myCar = myCar;
//}
public String getPersonDetails() {
	return this.firstName+"  "+this.lastName+ "  Car Datails : "+ myCar.getCarDetails();
}
}
 
 
