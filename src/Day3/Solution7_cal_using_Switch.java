//Write a program to create simple calculator using switch Statement
package Day3;

import java.util.Scanner;

public class Solution7_cal_using_Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a opreator +,-,*,%");
		int op=sc.next().charAt(0);
		System.out.println("Enter first no");
		int a=sc.nextInt();
		System.out.println("Enter Second no");
		int b=sc.nextInt();
		int res=0;
		switch(op)
		{
		case '+':
		res=a+b;
		System.out.println("addition of two no "+res );
		break;
		case '-':
		res=a-b;
		System.out.println(" Subtraction of two no "+res );
		break;
		case '*':
		res=a*b;
		System.out.println("multiplication of two no "+res );
		break;
		case '/':
		res=a/b;
		System.out.println("divsion of two no "+res );
		break;
		default:
			System.out.println("invalid opreator");
		}
		

	}

}
