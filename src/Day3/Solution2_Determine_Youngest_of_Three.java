//If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three
package Day3;
import java.util.Scanner;
public class Solution2_Determine_Youngest_of_Three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age of Ram : ");
		int a=sc.nextInt();
		System.out.print("Enter the age of Shyam : ");
		int b=sc.nextInt();
		System.out.print("Enter the age of Ajay : ");
		int c=sc.nextInt();
		if(a<b && a<c)
		{
			System.out.println("Ram is youngest");
		}else if(b<a &&b<c)
		{
			System.out.println("Shyam is youngest");
		}else
		{
			System.out.println("Ajay is youngest");	
		}

	}

}
