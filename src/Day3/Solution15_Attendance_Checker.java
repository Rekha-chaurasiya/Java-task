/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

package Day3;

import java.util.Scanner;

public class Solution15_Attendance_Checker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of classes held: ");
        int classesHeld = sc.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = sc.nextInt();
        float attendancePer = ((float)classesAttended / classesHeld) * 100;
        if(attendancePer<75)
        {
        	System.out.println("percentage of class attended "+attendancePer);
        	System.out.println("student is not allowed to sit in exam" );
        }else
        {
        	System.out.println("percentage of class attended  "+attendancePer);
        	System.out.println("student is allowed to sit in exam" );	
        }
        
		
	}
	

}
