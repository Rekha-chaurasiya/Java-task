//wap which reads a number and print the total of the number ex: given num: 1234 then output: 10

package Day4;

import java.util.Scanner;

public class Solution1_addtion {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number: ");
	int num=sc.nextInt();
	int sum=0;
	while(num>0)
	{
	int rem=num%10;
	 sum=sum+rem;
	 num=num/10;
		
	}
	System.out.println("the sum of " + sum);
	
	
	}

}
