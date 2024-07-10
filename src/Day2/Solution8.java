
//Write a java program to swap two value a, b without using third variables
package Day2;

public class Solution8 {
	public static void main(String args[])
	{
		int a=20;
		int b=30;
		a=a+b;
		b=a-b;
		a=a-b;
	     System.out.println("After the Swapping "+a+"  "+b);
		
	}

}
