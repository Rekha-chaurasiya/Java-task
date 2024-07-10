
//write a program to print the maximum  of three number using input function
package Day3;

import java.util.Scanner;

public class Soluion_1_Maximum_of_three_number {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first Number: ");
		int a=sc.nextInt();
		System.out.print("Enter the Second Number: ");
		int b=sc.nextInt();
		System.out.print("Enter the third Number: ");
		int c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("a is greatest");
		}else if(b>a&&b>c)
		{
			System.out.println("b is greatest");
		}else
		{
			System.out.println("c is greatest");
		}
			
	}

}
