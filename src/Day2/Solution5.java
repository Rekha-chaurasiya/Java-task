
//Write a java program using Ternary operator to print the citizen is eligible for vote if age is greater than 18.
package Day2;

import java.util.Scanner;

public class Solution5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age ");
		int age=sc.nextInt();
		String agelimit=age>18?"age is grater than is equal to 18 is eligible for vote":"age below 18 is not eligible for vote";
		System.out.println(agelimit);
	}

}
