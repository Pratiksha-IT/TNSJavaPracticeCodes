package com.day1variables;

public class Variables_demo {
	public static class Student_data{ 
	int roll_no=12;
	long phone=9876543210L;
	char grade='A';
	String name="Siya";
	float percentile=90.12F;
	
	public void student_data1() {
		System.out.println("Roll no"+" Name"+" Grade"+" Percentile"+" Phone No");
		System.out.println(roll_no+" "+name+" "+grade+" "+percentile+" "+ phone);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_data obj1=new Student_data();
		obj1.student_data1();
		

	}

}
