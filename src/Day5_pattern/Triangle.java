package Day5_pattern;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=sc.nextInt();

        for (int i = 1; i <= a; i++) {
            
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
           
            for (int k = i; k <= a; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
            
        }
	}

}
