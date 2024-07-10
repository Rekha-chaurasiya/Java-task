package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution7_first_pos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int arr []=new int[size];
		int newarr[]=new int[size+1];
		for(int i=0;i<size;i++)
		{
			System.out.println("Give the value for "+i+ " index");
			arr[i]=sc.nextInt();
			newarr[i+1]=arr[i];
		}
		System.out.println("Give the new value that we want to added at last index");
		newarr[0]=sc.nextInt();
		
		System.out.println(Arrays.toString(newarr));

	}

}
