package Day4;

import java.util.Scanner;

public class Solution_10_fact_using_for_loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number :");
	    int num=sc.nextInt();
	   
	    int fact=1;
	    for(int i=1;i<=num;i++)
	    {
	    	fact=fact*i;
	    }	
	    System.out.println(fact);

	}

}
