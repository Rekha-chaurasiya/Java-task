
package Array;

import java.util.Scanner;

public class One_D_User_input {

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
      for(int i=0;i<size;i++)
      {
    	  System.out.println(arr[i]);
      }
 
	}

}
