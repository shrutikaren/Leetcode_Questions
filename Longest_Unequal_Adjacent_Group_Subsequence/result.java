import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution{
	public static List<String> getLongestSubsequence(String[] words, int[] groups){
		int i = 1;
		int j = 1;
		
		List<String> output = new ArrayList<String>();
		output.add(words[0]);

		while ((i < words.length) && (j < groups.length)){
			if ( j - 1 >= 0){
				if (groups[j] != groups[j - 1]){
					output.add(words[i]);
				}
			}
			i ++;
			j ++;
		}

		return output;
		
	}

	public static void main(String[] args){
		// Test Case 1
		String[] words = {"a", "b", "c", "d"};
		int[] groups = {1, 0, 1, 1};

		System.out.println(getLongestSubsequence(words, groups));
		
		// Test Case 2
		String[] words2 = {"e", "a", "b"};
		int[] groups2 = {0, 0, 1};	
		System.out.println(getLongestSubsequence(words2, groups2));
	}
}
