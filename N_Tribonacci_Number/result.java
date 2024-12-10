import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution{
	public static int tribonacci(int n){
		int temp = 0;
		if (n == 0){
			return 0;
		} else if (n == 1){
			return 1;
		} else if (n == 2){
			return 1;
		} else {
			int a = 0;
			int b = 1;
			int c = 1;
			for (int i = 3; i <= n; i++){
				temp = a + b + c;
				a = b;
				b = c;
				c = temp;
			}
			return temp;
		}

	}

	public static void main(String[] args){
		for (int i = 0; i < 26; i ++){
			System.out.println(tribonacci(i));
		}
	}
}
