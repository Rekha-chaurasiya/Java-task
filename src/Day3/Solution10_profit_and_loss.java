//Write a program to calculate profit or loss
package Day3;

import java.util.Scanner;

public class Solution10_profit_and_loss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the cost price: ");
        float cp = sc.nextFloat();
        System.out.print("Enter the selling price: ");
        float sp = sc.nextFloat();
        
        float profitloss=sp-cp;
        if(profitloss>0)
        {
        System.out.println("profit"+profitloss)	;
        }else if(profitloss<0)
        {
        	 System.out.println("loss" +profitloss)	;	
        }else
        {
        	System.out.println("no profit no loss");
        }

	}

}
