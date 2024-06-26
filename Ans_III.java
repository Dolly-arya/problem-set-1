package com.statement;

public class Ans_III {

	public static void main(String[] args) {
		int n = 10;// 1st add n natural no.
		int sum=0;
		
		
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("Sum of first " + n 
                + " Natural Number = " + sum);

	}

}
