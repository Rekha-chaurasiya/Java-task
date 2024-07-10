package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution14_Merge {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of first array: ");
			int size1=sc.nextInt();
			System.out.println("Enter the size of Second array: ");
			int size2=sc.nextInt();
			int arr1 []=new int[size1];
			int arr2[]=new int[size2];
			int newarr[]=new int[arr1.length+arr2.length];
			for(int i=0;i<size1;i++)
			{
				System.out.println("Give the value for "+i+ " index for array 1");
				arr1[i]=sc.nextInt();
				
			}
			for(int i=0;i<size2;i++)
			{
				System.out.println("Give the value for "+i+ " index for array 2");
				arr2[i]=sc.nextInt();
				
			}
			for(int i=0;i<arr1.length;i++)
			{
				newarr[i]=arr1[i];
			}
			for(int i=0;i<arr2.length;i++)
			{
				newarr[arr1.length+i]=arr2[i];
			}
			System.out.println(Arrays.toString(newarr));

	}

}
