package com.nit.elc;
import com.nit.blc.bank;
import java.util.Scanner;

public class bankcustomer {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		
		System.out.print("Enter customer Name:");
		String customername = ab.nextLine();
		
		System.out.print("Enter account Number:");
		int accountnumber = ab.nextInt();
		
		System.out.print("Enter Currentbalance:");
		double currectbalance = ab.nextDouble();
		
		bank sbi = new bank();
		sbi.setcustomedetails(customername, accountnumber, currectbalance);
		
		while(true)
		{
			System.out.println("\n welcome to sbi bank ");
		System.out.println(" 1 : Cheack balnce\n 2 : withdrow\n 3 : deposit\n 4 : get Details \n 5 : exit");
			int choice = ab.nextInt();
			switch(choice)
			{
			case 1-> sbi.currentbalance();
			case 2 -> {
				System.out.print("Enter withdraw amount:");
				double amt = ab.nextDouble();
				sbi.withdraw(amt);
			}
			case 3->{
				System.out.print("Enter deposit amount:");
				double amt = ab.nextDouble();
				sbi.deposit(amt);
			}
			case 4->{
				sbi.displaydetails();
			}
			case 5->{
				System.out.println("thanks for coming sbi bank");
				System.exit(0);
			}
			}
		}
	}
	
}
