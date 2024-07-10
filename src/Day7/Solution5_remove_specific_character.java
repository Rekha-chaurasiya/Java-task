package Day7;

public class Solution5_remove_specific_character {
	public static void main(String args[])
	{
		String str="java is high level programming launguage";
		char target='a';
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(str.charAt(i)!=target)
			{
				result+=ch;
			}
			
		}
		System.out.println(result);
	}
}
