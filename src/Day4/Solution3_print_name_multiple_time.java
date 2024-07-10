
//Write a program that asks the user for their name and how many times to print it. The
package Day4;

import java.util.Scanner;

public class Solution3_print_name_multiple_time {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name=sc.nextLine();
		System.out.print("how many time we want to print : ");
		int num=sc.nextInt();
		while(num>0)
		{
		System.out.println("My name is "+name)	;
		num--;
		}

	}

}
