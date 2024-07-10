//Write a program that will print a box of #’s taking from user the height and width values.

package Day4;

import java.util.Scanner;

public class Solution7_pattern_print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a row :");
	    int row=sc.nextInt();
	    System.out.println("Enter a column :");
	    int col=sc.nextInt();
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<col;j++)
	    	{
	    		System.out.print("#");
	    	}
	    	System.out.println(" ");
	    }
	}

}
