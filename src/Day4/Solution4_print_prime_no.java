//write a program to given number is prime  or not 

package Day4;

import java.util.Scanner;

public class Solution4_print_prime_no {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number :");
    int num=sc.nextInt();
    int flag=0;
    for(int i=2;i<=num/2;i++)
    {
    	if(num%i==0)
    	{
    		flag++;
    		
    	}
    }
    if(flag==1)
    {
    	System.out.println("not a prime number");	
    }else
	{
		System.out.println(" prime number");	
	}

	}

}
