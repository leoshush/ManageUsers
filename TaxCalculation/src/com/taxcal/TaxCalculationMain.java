package com.taxcal;

import java.util.Scanner;

public class TaxCalculationMain {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Manager manager = new Manager();
	   
	   System.out.println("====================================================");
	   System.out.println("           TAX CALCULATION APPLICATION              ");
	   System.out.println("====================================================");
       System.out.print("Enter the username: ");
       String username = sc.next();
       System.out.print("Enter the password: ");
       String password = sc.next();
       manager.login(username, password);
       System.out.println("Welcome " + username );
       
	   
   }
}
