package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution8_add_element_specific_pos {

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
		
		System.out.println("Enter position : ");
		int pos=sc.nextInt();
		System.out.println("Enter new element of array: ");
		int element=sc.nextInt();
		for(int i=0;i<pos;i++)
		{
			newarr[i]=arr[i];
		}
		newarr[pos]=element;
		for(int i=pos;i<newarr.length-1;i++)
		{
			newarr[i+1]=arr[i];
		}
		
		System.out.println(Arrays.toString(newarr));


	}

}
