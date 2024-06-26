package com.statement;

public class Ans_XVI {
	static int fib(int n) {
		//if(n<=1) //base Condition
			//return n;
		  // return fib(n-1) + fib(n-2);
		int f[] = new int[n + 1];
		int i;
		f[0] = 0;
		if(n>0) {
			f[1]=1;
			
			for(i=2;i<=n;i++) {
				f[i] = f[i - 1] + f[i - 2];
			}
		}
		return f[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=4;
        System.out.println(fib(n));
	}

}
