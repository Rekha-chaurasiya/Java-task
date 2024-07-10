//Write a program to print remark according to the grade obtained using switch statement

package Day3;

import java.util.Scanner;

public class Solution8_Grade {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a grade A,B,C,D,E ");
		char grade=sc.next().charAt(0);
		switch(grade)
		{
		case 'A':
			System.out.println("Remark Excellent");
			break;
		case 'B':
			System.out.println("Remark very good");
			break;
		case 'C':
			System.out.println("Remark Good");
			break;
		case 'D':
			System.out.println("Remark Second Grade");
			break;
		case 'E':
			System.out.println("Remark Fail");
			break;
		default :
			System.out.println("Invalid Remarks");
			break;
		}
	}

}
