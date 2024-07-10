package Array;

import java.util.*;

public class Max_and_Min_Element {

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
	      int max=arr[0];
	      int min=arr[0];
	      for(int i=0;i<size;i++)
	      {
	    	  if(arr[i]>max)
	    	  {
	    		  max=arr[i];
	    	  }
	    	  if(arr[i]<min)
	    	  {
	    		 min=arr[i] ;
	    	  }
	    	
	      }
	      System.out.println(Arrays.toString(arr));
	      System.out.println("the max no is "+max);
    	  System.out.println("the min no is "+min);

	}

}
