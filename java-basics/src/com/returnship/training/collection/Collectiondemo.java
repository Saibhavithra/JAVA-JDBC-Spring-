package com.returnship.training.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collectiondemo {
	public static void main(String[] args) {
		//Set<Integer> rollNos = new HashSet<>();
		Set<Integer>  rollNos = new TreeSet<>();
		 rollNos.add(101);
		 rollNos.add(121);
		 rollNos.add(11);
		 rollNos.add(111);
		 
			Set<String> names = new TreeSet<>();
			names.add("Tom");
			 names.add("Sai");
			 names.add("Madhu");
			 names.add("Brian");
			 
			 Set<Student> studentSet = new TreeSet<>(new Agecomparator());
			 studentSet.add(new Student("karl",32,"A+"));
			 studentSet.add(new Student("Mark",32,"A+"));
			 studentSet.add(new Student("Boris",32,"A+"));
			 
			 
			List<Integer>numberList = new ArrayList<>();
			 numberList.add(101);
			 numberList.add(121);
			 rollNos.add(11);
			 numberList.add(111);
			 
			 for (int num:numberList) {
				 System.out.println(num);
			 }
			 
			 
			 List<Student>studList = new ArrayList<>();
			 studList.add(new Student("karl",32,"A+"));
			 studList.add(new Student("karl",32,"A+"));
			 studList.add(new Student("Mark",32,"A+"));
			 studList.add(new Student("Boris",32,"A+"));
			
			 Collections.sort(studList, new Namecomparator());
			 
			/* List<Student>studList = Arrays.asList(new Student("karl",32,"A+"),new Student("karl",32,"A+"),
					 new Student("Boris",32,"A+"));
			 System.out.println(studList.get(3));
			 for (Student student:studentSet){
			 System.out.println(student);
			 }*/
			 
		 for(int number:rollNos) {
			 System.out.println(number);
		 }
		 for(String name:names) {
			 System.out.println(name);
		 }
		 /*Iterator<Integer>  it =  rollNos.iterator();
		 
		 while(it.hasNext()) {
			 int firstRollNo = it.next();
			 System.out.println(firstRollNo);
		 }*/
		 Iterator<String> it = names.iterator();
		 System.out.println("**********Names********");
		 while(it.hasNext()) {
		 	  String str = it.next();
		 	  System.out.println(str);
	}
	
	//for(Map.Entry<String, Integer> entry: myMap.entrySet()) {
	//	Sysout("key:"+entry.getKey(+"Value:"+entry.getValue))
	

}
}

//}
