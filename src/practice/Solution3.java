//Develop a program that ask user an arithmetic operator(‘+’, ’-‘, ’*’, or ’/’) and two numbers and perform corresponding 
//calculation on the operands? Using conditional statement
package practice;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  operator +, -, *, /: ");
		int op=sc.next().charAt(0);
		System.out.println("Enter your first Number : ");
		int a=sc.nextInt();
		System.out.println("Enter our second Number :");
		int b=sc.nextInt();
		int res;
		if(op=='+')
		{
			res=a+b;
			System.out.println("Addition of two number: "+res);
		}else if(op=='-')
		{
			res=a-b;
			System.out.println("Substraction of two Number: "+res);
		}else if(op=='*')
		{
			res=a*b;
			System.out.println("Multiplication of two Number: "+res);
		}else if(op=='/')
		{
			res=a/b;
			System.out.println("Devision of two Number: "+res);
		}
	

	}

}
