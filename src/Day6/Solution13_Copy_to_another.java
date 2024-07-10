package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution13_Copy_to_another {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		
		int arr []=new int[size];
	
		int newarr[]=new int[arr.length];
		for(int i=0;i<size;i++)
		{
			System.out.println("Give the value for "+i+ " index");
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
	      newarr[i]=arr[i];
		}
	     System.out.println(Arrays.toString(newarr));
	    
	}

}
