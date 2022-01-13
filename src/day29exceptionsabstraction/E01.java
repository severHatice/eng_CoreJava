package day29exceptionsabstraction;

import java.util.Scanner;

import day30exceptionsinterfacesiteratorscollections.I01;

public class E01 {
	
	/*
	 	
	 */

	public static void main(String[] args) {
		
		//IllegalArgumentException
		//Sometimes we do not want to use some values for some parameters.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age = scanner.nextInt();
		
		try{
			
			setAge(age);
			
		}catch(IllegalArgumentException e) {
			
			System.out.println("Do not use negative values for ages...");
			
		}
		
	}
	
	public static void setAge(int age) throws IllegalArgumentException{
		
		if(age<0) {
			
			throw new IllegalArgumentException();
			
		}else {		

			System.out.println("Your age is " + age);
			
		}
	}

}
