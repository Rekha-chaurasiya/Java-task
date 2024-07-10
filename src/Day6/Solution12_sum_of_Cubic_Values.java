package Day6;

import java.util.Scanner;

public class Solution12_sum_of_Cubic_Values {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		
		int arr []=new int[size];
	
		int newarr[]=new int[arr.length+1];
		for(int i=0;i<size;i++)
		{
			System.out.println("Give the value for "+i+ " index");
			arr[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
	    newarr[i]=arr[i]*arr[i]*arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+newarr[i];
		}
		System.out.println(sum);

	}

}
