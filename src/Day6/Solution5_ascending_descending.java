package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution5_ascending_descending {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int arr []=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Give the value for "+i+ " index");
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Ascending Order ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ,");
		}
		System.out.println("\n Descending Order");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ,");
		}
	
		

	}

}
