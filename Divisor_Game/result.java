import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

class Solution{
	public static boolean divisorGame(int n){
		int count = -1;
		Random r = new Random();

		if (n == 0){
			return false;
		}
		else if (n == 1){
			return false;
		}
		else if (n == 2){
			return true;
		}
		else{
			while (n > 1) { 
				if (n == 1 || n == 0){
					return false;
				}
				int i = r.nextInt(1, n);
				
				if ((n % i) == 0){
					count += 1;
					n = n - i;
					continue;
				}
			}
			if (count % 2 == 0){
				return true;
			} else{
				return false;
			}
		}
	}

	public static void main(String[] args){
		// Test Case 1
		boolean output = divisorGame(2);
		System.out.println(output);

		// Test Case 2
		boolean output2 = divisorGame(3);
		System.out.println(output2);
	}

}
