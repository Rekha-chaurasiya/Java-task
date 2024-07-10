package Day3;

import java.util.Scanner;

public class Solution9_name_of_Month {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the month: ");
		int mon=sc.nextInt();
		
		switch(mon)
		{
		case 1:
			System.out.println("jan");
			break;
		case 2:
			System.out.println("feb");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("August");
			break;
			
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("nov");
			break;
		case 12:
			System.out.println("dec");
			break;
			default:
				System.out.println("invalid month");
		}

	}

}
