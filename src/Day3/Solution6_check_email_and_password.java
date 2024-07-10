
/*6)wap to check email and password is matching or not 
ex: email=admin@gmail.com and 
password= admin@123*/

package Day3;

import java.util.Scanner;

public class Solution6_check_email_and_password {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your email: ");
		String email=sc.nextLine();
		System.out.print("Enter your email: ");
		String pass=sc.nextLine();
		if(email.equals("ucs@gmail.com") && pass.equals("ucs@123"))
		{
			System.out.println("email and password is correct");
		}else
		{
			System.out.println("email and password is invalid");
		}
	}

}
