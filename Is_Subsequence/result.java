import java.util.List;
import java.util.ArrayList;

class Solution{
	public static boolean isSubsequence(String s, String t){
		int count = 0;
		int indexfound = 0;
		boolean found = false; 
		for (int i = 0 ; i < s.length(); i ++){
			for (int j = i; j < t.length(); j ++){
				if ((t.charAt(j) == s.charAt(i)) && (j >= indexfound)){
					indexfound = j;
					count++;
					break;
				}	
			}		
		}
		
		if (count == s.length()){
			return true;
		}
		return false;
	}

	public static void main(String[] args){

		// Test Case 1 
		String s = "abc";
		String t = "ahbgdc";
		boolean output = isSubsequence(s, t);
		System.out.println(output);


		// Test Case 2 
		String s1 = "axc";
		String s2 = "ahbgdc";
		boolean output_2 = isSubsequence(s1, s2);
		System.out.println(output_2);
	}
}
