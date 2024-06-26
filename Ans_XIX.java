package com.statement;
//factor of the number
public class Ans_XIX {

	public static void main(String[] args) {
		int num = 100;
		getFactors(num);
		
	}
	static void getFactors(int num) {
		for(int i=1;i<=(num/2);i++) {
			if(num%i==0) {
				System.out.println(i +" ");
			}
		}
		//print the number itself too
		System.out.println(num);
			
	}

}
//Time Complexity : O(n) 
//Auxiliary Space : O(1)
//This method is better than previous method, even though the time complexity is the same
//it runs half lesser loop than previous method
//ran for loop num times, however, this runs num/2 times
