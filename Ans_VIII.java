package com.statement;

public class Ans_VIII {

	public static void main(String[] args) {
		int i,n=33;
		boolean isprime= true;
		
		//0 and 1 are not prime no. also, negative numbers are notprime
		if(n<2) {
			isprime = false;
		}else {
			// running loop till n is wasteful because for any number n the numbers in
		     // the range(n/2 + 1, n) won't be divisible anyways.
			for(i=2;i<=n/2;i++) {
				if(n%i==0) {
					isprime = false;
					break;
				}
			}
		}
		String result = isprime ?"prime" : "not Prime";
		System.out.println("The number" + n + "is:"+ result);
		// Time Complexity : O(N)
	     // Space Complexity : O(1)
	     // This program is better than previous version as :
	     // Loops runs b/w [2, n/2] rather than [2, n-1]

	}

}
