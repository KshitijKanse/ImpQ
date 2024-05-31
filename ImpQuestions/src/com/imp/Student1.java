package com.imp;

import java.util.Scanner;

class Student2{
	int sid;
	String fname;
	String lname;
	String email;
	long contactNo;
	
	public Student2() {
	super();
	}
	
	public Student2(int sid, String fname, String lname, String email, long contactNo) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contactNo = contactNo;
	}
	 
	
	
	
	
	

}

public class Student1 {

	public static void main(String[] args) {
		
		System.out.println("Student Management System");
		Scanner sc=new Scanner(System.in);
		Student2 s=new Student2();
		int ch;
		do {

			System.out.println("\nWelcome To Student Management Application!!!!!!!!");
			System.out.println("Press 1: Add A Student.");
			System.out.println("Press 2: Display Student Information.");
			System.out.println("Enter choice:");
			ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Student ID: ");
			s.sid=sc.nextInt();
			System.out.println("Enter Student First Name: ");
			s.fname=sc.next();
			System.out.println("Enter Student Last Name: ");
			s.lname=sc.next();
			System.out.println("Enter Student Email-id: ");
			s.email=sc.next();
			System.out.println("Enter Student Contact No: ");
			s.contactNo=sc.nextLong();
			Student2 s1= new Student2(s.sid, s.fname, s.lname, s.email, s.contactNo);
			break;
		case 2:
			System.out.println("Display Data");
			System.out.println("\nStudent ID is "+s.sid+".\nStudent First Name "+ s.fname+".\nStudent Last Name is "+ s.lname+".\nStudent Email-Id is "+ s.email+".\nContact no is "+ s.contactNo+".");
			break;
		case 3:
			System.out.println("Exit...!!");
			break;
		}
		
	}while(ch!=3);
		
		
		
		}

}

