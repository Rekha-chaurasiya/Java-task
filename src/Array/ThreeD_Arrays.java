package Array;

import java.util.Scanner;

public class ThreeD_Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the block size");
		int b=sc.nextInt();
		System.out.println("Enter the row size");
		int r=sc.nextInt();
		System.out.println("Enter the col size");
		int c=sc.nextInt();
		
		int arr [][][]=new int[b][r][c];
		System.out.println("Enter the elements of the arrays: ");
		for(int k=0;k<b;k++)
		{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[k][i][j]=sc.nextInt();
			}
		}
		}
		System.out.println("Elements of Arrays: ");
		for(int k=0;k<b;k++)
		{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[k][i][j]+" ");
			}
			System.out.println();
		}
		

	
		}

	}

}
