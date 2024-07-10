package Array;

import java.util.Scanner;

public class Two_D_Arrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int r=sc.nextInt();
		System.out.println("Enter the col size");
		int c=sc.nextInt();
		
		int arr [][]=new int[r][c];
		System.out.println("Enter the elements of the arrays: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements of Arrays: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
