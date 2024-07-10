package Day6;

import java.util.Scanner;

public class Solution11_sum_of_odd_num {

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
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("sum of odd No : "+sum);

	}

}
