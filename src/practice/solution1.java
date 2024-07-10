//wap to compare two variables (a and b) and generate the following results:

package practice;

import java.util.Scanner;

public class solution1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first No: ");
	int a=sc.nextInt();
	System.out.println("Enter the Second No: ");
	int b=sc.nextInt();
	if(a>b)
	{
		System.out.print("a is greatest");
	}else if(b>a)
	{
		System.out.print("b is greatest");
	}else
	{
		System.out.println("both are equal");
	}
	
}
}
