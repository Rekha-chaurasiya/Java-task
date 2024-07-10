//write a program to print the given year is leap year or not using input function
package Day3;

import java.util.Scanner;

public class Solution3_Leap_Year {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=sc.nextInt();
		if(year%4==0)
		{
			if(year%100 !=0|| year % 400==0)
			{
				System.out.println(year+" is a leap year");
			}
		}
		else
		{
			System.out.println(year+" is not a  leap year");	
		}
	}

}
