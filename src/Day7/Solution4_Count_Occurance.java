package Day7;

public class Solution4_Count_Occurance {

	public static void main(String[] args) {
		String str="java is high level programming launguage";
		char target='a';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==target)
			{
				count++;
				
			}
		}
		System.out.print(count);

	}

}
