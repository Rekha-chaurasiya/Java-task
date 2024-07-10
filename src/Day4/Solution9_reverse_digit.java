//Write a program that prompts the user to input an integer and then outputs the number with the
//digits reversed. For example, if the input is 12345, the output should be 54321

package Day4;

import java.util.Scanner;

public class Solution9_reverse_digit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		int rev=0;
		while(num>0)
		{
		int rem=num%10;
		 rev=rev*10+rem;
		 num=num/10;
			
		}
		System.out.println("the sum of " + rev);

	}

}
