package com.imp;

import java.util.Scanner;

class Operations{
	
	public void StringVal() {
		
	}
	public void stringCon(String a,String b) {
		System.out.println("After Concatination "+a.concat(b)+"\n");
	}
	
	public void stringCom(String a,String b) {
		System.out.println("Strings Comparison is "+a.compareTo(b)+"\n"); 
	}
	
	public void stringSize(String a,String b) {
		String c=(a+" "+b);
		System.out.println("Size of 1st Sting is "+a.length()+" & Size of 2nd String is "+b.length()+"\n");
		
	}
	
	public void upper(String a,String b) {
		String c=(a+" "+b);
		System.out.println("In upper case string: "+c.toUpperCase()+"\n");
	}
	
	public void lower(String a,String b) {
		String c=(a+" "+b);
		System.out.println("In lower case string: "+c.toLowerCase()+"\n");
	}
 
}

public class StringOp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a = null,b = null;
		String c = (a+" "+b);
		
		System.out.println("Enter 1st String: ");
		a=sc.next();
		System.out.println("Enter 2nd String: ");
		b=sc.next();
		
		Operations op=new Operations();
		
		int choice;
		do {
			System.out.println("\nWelcome To String Operations!!!!!!!!");
			System.out.println("1.For String Concatination");
			System.out.println("2.For String Compare To");
			System.out.println("3.For String Size");
			System.out.println("4.For String Conversion to Upper");
			System.out.println("5.For String Conversion to Lower");
			System.out.println("6.Exit");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				op.stringCon(a, b);;
			break;
			case 2:
				op.stringCom(a, b);
			break;
			case 3:
				op.stringSize(a, b);
			break;
			case 4:
				op.upper(a, b);
			break;
			case 5:
				op.lower(a, b);
			break;
			case 6:
				System.out.println("Bye..Bye...");
			break;
			default:
				
			}
		
		}while(choice!=6);
			
		
	}

}
