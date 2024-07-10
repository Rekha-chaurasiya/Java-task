// Write a program to print reverse  multiplication tables of the given number 

package Day4;

import java.util.Scanner;

public class Solution6_print_table_rev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number :");
	    int num=sc.nextInt();
	    int res=1;
		 for(int i=10;i>=1;i--)
		 {
			 res=num*i;
			 System.out.println(num+" * "+i+" = "+res);
			 
		 }
	}

}
