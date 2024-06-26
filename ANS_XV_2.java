package com.statement;
// Using recursion
public class ANS_XV_2 {
	static int a=0,b=1,nextTerm;

	public static void main(String[] args) {
		int n = 15;
		//here we are printing 0th and 1st terms
		System.out.print(a + " , " + b +" , ");
		
		//n-2 as 2 terms already printed
		Fib(n-2);

	}
	static int Fib(int n) {
		if(n>0) {
			nextTerm = a+b;
			a =b;
			b =nextTerm;
			
			System.out.print(nextTerm +" , ");
			Fib(n-1);
		}
		return 0;
	}

}
