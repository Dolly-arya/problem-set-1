package com.statement;
//Leap year program in Java
//If the year satisfies either of the conditions, it's considered a leap year -
//1. The year must be divisible by 400.
//2. The year must be divisible by 4 but not 100.
public class Ans_VII {

	public static void main(String[] args) {
		int year = 2020;
		
		if(year%400==0)
			System.out.println(year +"is a leap year");
		
		else if(year%4 == 0 && year%100 != 0)
			System.out.println(year +"is a leap year");
		else
			System.out.println(year +"is not a leap year");


	}

}
