package Day6;

import java.util.Scanner;

public class Solution15_print_positive {
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array: ");
	int size1=sc.nextInt();

	int arr1 []=new int[size1];
	
	for(int i=0;i<size1;i++)
	{
		System.out.println("Give the value for "+i+ " index for array 1");
		arr1[i]=sc.nextInt();
		
	}
	
	for(int i=0;i<size1;i++)
	{
		if(arr1[i]>0)
		{
		System.out.print(arr1[i]+" ");
		}
		
	}
	}
}
