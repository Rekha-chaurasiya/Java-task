
/*Write a program to input basic salary of an employee and calculate its Gross salary according to following:

Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/
package Day3;

import java.util.Scanner;

public class Solution11_Gross_Salary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter basic salary: ");
	        float bs = sc.nextFloat();
	        float grossSalary; 

	         if (bs <= 10000) {
	         grossSalary = bs + (bs*20/100 )+ (bs*80/100);

	        } else if (bs <= 20000) {
	        	 grossSalary = bs + (bs*25/100 )+ (bs*90/100);
	        } else {
	        	 grossSalary = bs + (bs*30/100 )+ (bs*95/100);
	        }
	         

	        System.out.println("Gross Salary: " + grossSalary);

	}

}
