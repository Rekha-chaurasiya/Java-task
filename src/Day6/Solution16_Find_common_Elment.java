package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution16_Find_common_Elment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		int size1=sc.nextInt();
		System.out.println("Enter the size of Second array: ");
		int size2=sc.nextInt();
		int arr1 []=new int[size1];
		int arr2[]=new int[size2];
		int newarr[]=new int[arr1.length];
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
			for(int j=0;j<arr2.length;j++)
			{
			if(arr1[i]==arr2[j])
			{
				newarr[i]=arr1[i];
			}
			}
		}
		System.out.println(Arrays.toString(newarr));

	}

}
