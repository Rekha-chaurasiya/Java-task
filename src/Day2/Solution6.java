
//Write a java program to calculate sum of 5 subjects & find percentage

package Day2;

public class Solution6 {
	public static void main(String args[])
	{
		int maths=30;
		int html=40;
		int css=45;
		int dbms=48;
		int jsp=36;
		int res=maths+html+css+dbms+jsp;
		float per=(res*100)/250;
		
		System.out.println("sum of 5 subject "+res +" \n percentage "+per);
	}

}
