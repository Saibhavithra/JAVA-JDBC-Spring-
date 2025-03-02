package com.returnship.training.java8;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Lambdademo {
	public static void main(String[] args){
		Myfuncinterface obj = (m,n) -> m+n;
		System.out.println("sum:" + obj.sum(43, 28));
		
		//Predicate<Integer> pred =x-> x%2=0;
		//pred.test(34);
		//BiPredicate<Integer, Integer> p = (n,m) -> n > m;
		
		//System.out.println(p.test(12,14));
		
		BiFunction<Integer, Integer, Double> avg = (x, y) -> (double)(x+y)/2;
		
		System.out.println(avg.apply(2,3));
		
		add(2,3);
		add(4,5,6);
		add();
	}
	
	public static int add(int... param) {  //varargs
		
		System.out.println(param.length);
		return 100;
	}
	
	



	

}

