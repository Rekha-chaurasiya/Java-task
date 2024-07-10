//Write a program to check whether a number is negative, positive or zero

package practice;

import java.util.Scanner;

public class Solution2 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No: ");
	int a=sc.nextInt();
	 String username="JAVA IS A HIGH LEVEL PROGRAMMING LANGUAGE";
     System.out.println("============== output====== ");
     System.out.println(username.substring(10,15));
	if(a>0)
	{
		System.out.println("number is positive");
	}else if(a<0)
	{
		System.out.println("number is negative ");	
	}else
	{
		System.out.println("Number is Zero");
	}
}
}
