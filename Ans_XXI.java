package com.statement;

public class Ans_XXI {

	public static void main(String[] args) {
		int num = 28 ,sum=0,i=1;
		
		// all divisors of the numbers (excluding the number itself)
        // can be found before num/2
        // note we will need to use '=' sign as for even numbers
        // like 28, half of the number i.e 14 will also be the divisor
      while(i<=num/2) {
    	  // check if i is a divisor, if yes then add to sum
    	  if(num%i==0)
    		  sum=sum + i;
    	  i++;
      }
      
      if(sum==num)
    	  System.out.println(num +"Is a perfect number");
      else
    	  System.out.println (num + " Is not a perfect number");
	}

}
