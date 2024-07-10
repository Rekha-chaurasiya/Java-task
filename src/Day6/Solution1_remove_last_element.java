package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1_remove_last_element {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of  array Element: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter " +i+ " index Element: ");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<size-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
