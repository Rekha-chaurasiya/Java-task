//write a program to print the given number is even or odd
package practice;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Number is even");
		}else
		{
			System.out.println("Number is odd");
		}
		
	}

}
