package Day3;

import java.util.Scanner;

public class Solution13_Increasing_Decresing {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n1=sc.nextInt();
		System.out.print("Enter a number :");
		int n2=sc.nextInt();
		System.out.print("Enter a number :");
		int n3=sc.nextInt();
		if(n1>n2 &&n2>n3)
		{
			System.out.println("Decreasing");
		}
		else if(n1<n2&&n2<n3)
		{
			System.out.println("Increasing");
		}else
		{
			System.out.println("mixed");
		}
		}
	}


