//Write a program to ask user to enter 5 number and  find the sum of 5 integers.

package Day4;

import java.util.Scanner;

public class Solution8_user_input_sum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter five integers:");

	        int sum = 0;
	        for (int i = 0; i < 5; i++) {
	            
	            int num = sc.nextInt();
	            sum=sum+ num;
	        }
	        System.out.println("Sum of the entered numbers: " + sum);
	}

}
