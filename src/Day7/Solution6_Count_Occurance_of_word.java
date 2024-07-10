package Day7;

public class Solution6_Count_Occurance_of_word {

	public static void main(String[] args) {
		String str="java is high level programming launguage";
		
		String target="java";
		
		     
		        String[] words = str.split("\\s+"); // Split the sentence into words
		        int count = 0;
		        for (String word : words) {
		            if (word.equals(target)) {
		                count++;
		            }
		        }
		        System.out.println( count);
		    }
		


	}


