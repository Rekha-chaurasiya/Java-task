package Day4;

import java.util.Scanner;

public class Solution5_fact_using_while_loop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number :");
	    int num=sc.nextInt();
	   
	    int fact=1;
	    while(num>0)
	    {
	    	fact=fact*num;
	    	num--;
	    }
	    System.out.println(fact);

	}

}
