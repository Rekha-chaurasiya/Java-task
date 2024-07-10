package practice;

public class EvenOrOddUsingForLoop {

	public static void main(String[] args) {
		int count=0;
		for(int a=1;a<70;a++)
		{
			if(a%2==0)
			{
				count++;
				System.out.println("Even Number: "+count);
			}else {
				count++;
				System.out.println("odd Number: "+count);
			}
		}

	}

}
