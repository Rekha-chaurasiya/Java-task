package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_One_D_Array {

	public static void main(String[] args) {
		
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a size that we want to store: ");
	      int size=sc.nextInt();
	      int arr[]=new int[size];
	      for(int i=0;i<size;i++)
	      {
	    	  System.out.println("Enter the value for "+i+ " index ");
	    	  arr[i]=sc.nextInt();
	      }
	      System.out.println(Arrays.toString(arr));
	      Arrays.sort(arr);
	      System.out.println(Arrays.toString(arr));
	      for(int i=size-1;i>=0;i--)
	      {
	    	  System.out.println(arr[i]);
	      }
	 
		}

	}


