package com.abes;

import com.abes.FirstJava.Student;

public class FirstJava {
	class Student{
		int rollNo;
		String name;
		 void display() {
			 System.out.println(rollNo+" "+name);
		 }
	};
// dynamic m method is achieved through main class 
	//com.abes package collection of class
public  static class TestStudent{
	public static void main(String[] args) {
//		// TODO Auto-generated method stud
//		System.out.println("Hello Java Program");
////	variables camel case and classes pascal case
//		/***Documentation comment*/
//abstract class means we dont need to create object
		//interface-> pure abstract class
		
		Student s1 =new Student();
		s1.rollNo=101;
		s1.name="Rahul";
		s1.display();
		return;
	}
	

}
;};
