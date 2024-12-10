import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution{
	public static int countDigits(int number){
		number = Math.abs(number);
		return String.valueOf(number).length();
	}

	public static int numberCount(int a, int b){
		int count = b - a + 1;

		List<String> stringnum = new ArrayList<String>();

		for (int i = a; i < b + 1; i ++){
			String number = String.valueOf(i);
			stringnum.add(number);
		}
		int index = 0;
		for (int i = a; i < stringnum.size() ; i ++){
			String current = stringnum.get(i);
			// Now we are looking at a specific number in the array
			for (int k = 0; k < current.length() ; k++){
				for (int j = k + 1; j < current.length(); j++){
					if (current.charAt(k) == current.charAt(j)){
						count--;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args){
		int a = 1;
		int b = 20;
		int output = numberCount(a, b);
		System.out.println(output);
	}

}
