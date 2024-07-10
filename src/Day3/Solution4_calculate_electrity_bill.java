/*
wap to calculate the electrity bill
conditions:
if below 100 unit : free
next 100 : 5rs per unit charge 
next 200 : 10rs per unit charge
ex: if unit of your bill is 350 then expected output is 2000.
350 
1-100=0
101-200 = 100*5 = 500
201-350=150*10=1500
total=0+500+1500=2000
 */


package Day3;

import java.util.Scanner;

public class Solution4_calculate_electrity_bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the electric bill:");
		int units=sc.nextInt();
		int bill = 0;
		        
		        if (units <= 100) {
		            bill = 0;
		        } else if (units <= 200) {
		            bill = (units - 100) * 5;
		        } else if (units <= 400) {
		            bill = (100 * 5) + (units - 200) * 10;
		        } else {
		            bill = (100 * 5) + (200 * 10) + (units - 400) * 15;
		        }
		System.out.println("total bill is:"+bill);
		 
		}

}
