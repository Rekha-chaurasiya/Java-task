//Take input of age of 3 people by user and determine oldest and youngest among them.
package Day3;

import java.util.Scanner;

public class Solution14_oldest_y {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age of first person : ");
		int a=sc.nextInt();
		System.out.print("Enter the age of second person : ");
		int b=sc.nextInt();
		System.out.print("Enter the age of third person : ");
		int c=sc.nextInt();
		   if (a > b && a > c) {
	       System.out.println("First person is oldest");
	       }else if (b > a && b > c) {
	       System.out.println("Second person is oldest");
	       } else {
	       System.out.println("Third person is oldest");
	        }
            if (a < b && a < c) {
	            System.out.println("First person is youngest");
	        } else if (b < a && b < c) {
	            System.out.println("Second person is youngest");
	        } else {
	            System.out.println("Third person is youngest");
	        }
      }

      }
