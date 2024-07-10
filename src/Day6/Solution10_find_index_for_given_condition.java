package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution10_find_index_for_given_condition {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the array size");
	  int size=sc.nextInt();
	  int arr[]=new int[size];
	  for(int i=0;i<size;i++)
	  {
		  System.out.println("Enter element for "+i+" index");
		arr[i]=sc.nextInt();  
	  }
	  System.out.println("Enter element you want to print ");
	  int element=sc.nextInt();
	  System.out.println(Arrays.toString(arr));
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]==element)
		  {
			  System.out.println("index for give element "+i);
		  }
	  }
	  
  }
}
