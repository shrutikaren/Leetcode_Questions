import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution{
	public static int maxSequence(String sequence, String word){
		int j = 0;
		int count = 0;
		boolean found = false;
		for (int i = 0; i < word.length(); i ++){
			while (j < sequence.length() && sequence.charAt(j) != sequence.charAt(i)){
				j++; //move the pointer ahead 
			}

			if (j == sequence.length()){
				return count;
			}

			j ++;
			count ++;
		}
		return count;
	}

	public static void main(String[] args){
		// Test Case One
		String sequence = "ababc";
		String word = "ab";
		int result = maxSequence(sequence, word);
		System.out.println(result);

		// Test Case Two
		String sequence2 = "ababc";
		String word2 = "ba";
		int result2 = maxSequence(sequence2, word2);	
		System.out.println(result2);
	}

}
