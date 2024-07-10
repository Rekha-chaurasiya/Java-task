package Day7;

public class Solution3_delete_all_consonant {
	public static void main(String args[])
	{
		String str="Hello, have a good day";
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				result+=ch;
			}
			
		}
		System.out.println(result);
	}

}
