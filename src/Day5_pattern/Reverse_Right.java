package Day5_pattern;

import java.util.Scanner;

public class Reverse_Right {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int k=a;k>=i;k--)
			{
				System.out.print("*");
			}
		
			System.out.println(" ");
			}
}

	}


