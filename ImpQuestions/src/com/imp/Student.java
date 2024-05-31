package com.imp;

import java.util.Scanner;

class Info{
	private int stdid;
	private String fname;
	private String lname;
	private String emailid;
	private long contactno;

	Scanner sc=new Scanner(System.in);
	
	public void addStudent() {
		System.out.println("Enter Student Id: ");
		stdid=sc.nextInt();
		System.out.println("Enter Student First Name: ");
		fname=sc.next();
		System.out.println("Enter Student Last Name: ");
		lname=sc.next();
		System.out.println("Enter Student Email-Id: ");
		emailid=sc.next();
		System.out.println("Enter Student Contact No.: ");
		contactno=sc.nextLong();
	}
	public void dispStudent() {
		System.out.println("Student Id is "+stdid);
		System.out.println("His Name is "+fname+" "+lname);
		System.out.println("Student's Email-Id is "+emailid);
		System.out.println("& Contact No. is "+contactno);
	}
}
public class Student {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many studemt u want to add: ");
		int size=sc.nextInt();
		
		Info b[]=new Info[size];
		
		for(int i=0;i<b.length;i++) {
			b[i]=new Info();
			b[i].addStudent();
			int choice;
			do {

				System.out.println("\nWelcome To Student Management Application!!!!!!!!");
				System.out.println("Press 1: Add A Student.");
				System.out.println("Press 2: Display Student Information.");
				System.out.println("Enter choice:");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					for(int j=0;j<b.length;j++) {
						b[i].addStudent();
					}
				break;
				case 2:
					for(int j=0;j<b.length;j++) {
						b[i].dispStudent();
					}
				break;
				case 3:
					System.out.println("Bye Bye.........");
				break;
				default:
					System.out.println("Wrong choice!!");
		}
}while(choice!=3);
			
		}

		}
	}


