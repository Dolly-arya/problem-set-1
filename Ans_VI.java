package com.statement;

public class Ans_VI {

	public static void main(String[] args) {
		int num1 = 10, num2 = 50, num3 = 30;
		
		//comparing if num1 with other numbers
		if((num1>=num2) && (num1>=num3))
			System.out.println(num1 +"is the greater");
		
		//checking if num2 is greater
		else if(num2>=num1 && num2>=num3)
			System.out.println(num2 +"is the greater");
		
		//num has to be greater then if not above
		else
			System.out.println(num3 +"is the greater");

	}

}
