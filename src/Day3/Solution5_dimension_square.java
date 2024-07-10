

//wap which reads two values height and width and check given dimension is square or rectangular
package Day3;

import java.util.Scanner;

public class Solution5_dimension_square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a height: ");
		int height=sc.nextInt();
		System.out.println("Enter a height: ");
		int width=sc.nextInt();
		
		if(height==width)
		{
			System.out.println("It is square");
		}else
		{
			System.out.println("It is rectangular");
		}

	}

}
