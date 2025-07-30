package com.nit.blc;

public class bank {
	 private String customername;
	 private int accountnumber;
	 private double currentbalance;
	
	 private static String bankname="sbi";
	 private static String bankaddress="hydrebad";
	 private static String bankifsccode="sbin00b116";
	 
	 
	 public void setcustomedetails(String customername, int accountnumber, double currectbalance)
	 { 
		 this.customername = customername;
		this.accountnumber = accountnumber;
		 this.currentbalance = currectbalance;
	 }
	 
	 public void withdraw(double amount)
	 {
		 if(amount>currentbalance)
		 {
			System.err.println("You have insufficient balance"); 
	     }
		 else
		 {
			currentbalance = currentbalance-amount;
			System.out.println("widraw Sucessfull");
		 }
	 }
	 
	 public void deposit(double amount)
	 {
		 if(amount<0)
		 {
			 System.err.println("amount wrong");
		 }
		 else
		 {
			 currentbalance+=amount;
			 System.out.println("amount deposit suscessful");
		 }
     }
	 
	 public void currentbalance()
	 {

		 System.out.println("currentbalance :" +currentbalance);
	 }
	 
	 
	 public void displaydetails()
	 {
		 System.out.println("\nCustomer Name: "+customername);
		 System.out.println("Account Number: "+accountnumber);
		 System.out.println("Current Balance: "+currentbalance);
		 System.out.println("Bank Name :"+bankname);
		 System.out.println("Bank Address :"+bankaddress);
		 System.out.println("Bank IFSC Code :"+bankifsccode);
	 }
	 
	 
}
	

