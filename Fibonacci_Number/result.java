import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution{
	public static int fib(int n){
		if (n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		else{
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args){
		int number = 2;
		int number2 = 3;
		int number3 = 4;
		System.out.println(fib(number));
		System.out.println(fib(number2));
		System.out.println(fib(number3));
	}

}
