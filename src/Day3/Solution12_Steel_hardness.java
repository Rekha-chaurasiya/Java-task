 /*A certain grade of steel is graded according to the following conditions
Hardness must be greater than 50
Carbon content must be less than 0.7
Tensile strength must be greater than 5600
The grades are as follows:
Grade is 10 if all three conditions are met
Grade is 9 if conditions (i) and (ii) are met
Grade is 8 if conditions (ii) and (iii) are met
Grade is 7 if conditions (i) and (iii) are met
Grade is 6 if only one condition is met
Grade is 5 if none of the conditions are met
Write a program, which will require the user to give values of hardness, 
carbon content and tensile strength of the steel under consideration and output the grade of the steel*/

package Day3;

import java.util.Scanner;

public class Solution12_Steel_hardness {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the hardness of the steel: ");
        int hardness = sc.nextInt();
        System.out.print("Enter the carbon content of the steel: ");
        float carbonContent = sc.nextFloat();
        System.out.print("Enter the tensile strength of the steel: ");
        int tensileStrength = sc.nextInt();
        if(hardness>50 && carbonContent<0.7 &&tensileStrength>5600)
        {
        	System.out.println("Grade is 10");
        }else if(hardness>50 && carbonContent<0.7)
        {
        	System.out.println("Grade is 9");
        }else if(hardness>50 && tensileStrength>5600)
        {
        	System.out.println("Grade is 8");
        }else if(carbonContent<0.7 && tensileStrength>5600)
        {
        	System.out.println("Grade is 7");
        }else if(hardness>50 || carbonContent<0.7 ||tensileStrength>5600)
        {
        	System.out.println("Grade is 6");
        }else
        {
        	System.out.println("Grade is 5");	
        }
	}

}
