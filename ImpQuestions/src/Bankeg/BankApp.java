package Bankeg;

import java.util.Scanner;


class Bank{
	private String accno;
	private String custname;
	private String acctype;
	private long balance;
	Scanner sc=new Scanner(System.in);
	
	public void openAccount() {
		System.out.println("Enter Account Number: ");
		accno=sc.next();
		System.out.println("Enter Account Type: ");
		acctype=sc.next();
		System.out.println("Enter Customer Name: ");
		custname=sc.next();
		System.out.println("Enter current Balance: ");
		balance=sc.nextLong();
	}
	
	
	public void showAccountDetails() {
			System.out.println("Name Account Holder is "+custname);
			System.out.println("Account Number is "+accno);
			System.out.println("Account Type "+acctype);
			System.out.println(balance+" Current Balance in Account ");
		}
		


	public void depositeMoney() {
		long amount;
		System.out.println("Enter how much ammount you want to deposite: ");
		amount = sc.nextLong();
		
		balance = balance + amount;  //balance =+ amount;
		
	}

	
	public void withdrawMoney() throws ValidAmount {
		long amount;
		System.out.println("Enter how much ammount you want to Withdraw: ");
		amount = sc.nextLong();
		
		/*
		if(balance>=amount) {
		balance =- amount;          //balance = balance - amount;
		System.out.println("Ammount  After Withdraw: "+balance);
		}
		else {
			System.out.println("Invalid Transection!!!!!     \nInsufficient Amount");
		} */
		
		
		
		System.out.println("Your Balence After Withdraw: "+balance);
		if(amount>balance) {
			throw new ValidAmount("Enter Valid Ammount,You Dont have "+amount+" Amount");
		}else {
			System.out.println("Amount is deposited.");
		}
		
	}
	
	public boolean searchAccount(String accNo) {
			
		if(accno.equals(accNo)) {
			showAccountDetails();
			return true;
			
		}
		return false;
		}
		
		
	}
	
public class BankApp {

	
	
	public static void main(String[] args) throws ValidAmount {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How many customers u want to store:");
		
		int size=sc.nextInt();
		
		Bank b[]=new Bank[size];
		
		for(int i=0;i<b.length;i++) {
			b[i]=new Bank();
			b[i].openAccount();
			
		}
		int choice;
		do {

			System.out.println("Welcome To Banking Application!!!!!!!!");
			System.out.println("1.Display Account Details");
			System.out.println("2.Search Account Details");
			System.out.println("3.Deposite Money in Account");
			System.out.println("4.Widhraw Money from Account");
			System.out.println("5.Exit");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				for(int i=0;i<b.length;i++) {
					b[i].showAccountDetails();
				}
			break;
			
			case 2:
				System.out.println("Enter Account number which u want to search:");
				String accountNumber=sc.next();
				boolean found=false;
				for(int i=0;i<b.length;i++) {
					found=b[i].searchAccount(accountNumber);
					if(found) {
						break;
					}
					if(!found) {
						System.out.println("Search failed!!Account no does not exist");
					}
				}
				break;
			case 3:
				System.out.println("Enter Account number which u want to Deposite:");
				 accountNumber=sc.next();
				 found=false;
				for(int i=0;i<b.length;i++) {
					found=b[i].searchAccount(accountNumber);
					if(found) {
						b[i].depositeMoney();
						break;
					}
					if(!found) {
						System.out.println("Search failed!!Account no does not exist");
					}
				}
				break;
			case 4 :
					System.out.println("Enter Account number which u want to Widhraw:");
					 accountNumber=sc.next();
					 found=false;
					for(int i=0;i<b.length;i++) {
						found=b[i].searchAccount(accountNumber);
						if(found) {
							b[i].withdrawMoney();
							break;
						}
						if(!found) {
							System.out.println("Search failed!!Account no does not exist");
						}
					}
					break;
					case 5:
						System.out.println("Bye Bye.........");
					break;
					default:
						System.out.println("Wrong choice!!");
			}
	}while(choice!=5);


		
	}

}
