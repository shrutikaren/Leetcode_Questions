import java.util.List;
import java.util.ArrayList;

class Solution{
	public static int maxProfit(int[] profit){
		int total_days = profit.length;
		
		// This will be our dynamic programming table to store all our
		// values inside here carefully and then we can iterate through
		// this table later on to check for the maximum profit value 
		// that we are able to derive from our calculations.
		int[][] dp = new int[total_days][total_days];
		
		// Creating our two pointers for our list, namely i and j
		// Allowing us to run through our entire profit list iteratively
		for (int i = 0; i < total_days; i ++){
			for (int j = i; j < total_days; j ++){

				// Case 1: Value on a day > Value on future day 
				// Profit will reduce = Equivalent to 0 profit
				if (profit[i] > profit[j]){
					dp[i][j] = 0; 
				}

				// Case 2: Value of a day == Value on a future day
				// Profit will be 0 because it is the same day 
				if (profit[i] == profit[j]){
					dp[i][j] = 0;
				}

				// Case 3: Value of a day < Value of future day 
				// Values have increased = Profit gained 
				if (profit[i] < profit[j]){
					dp[i][j] = profit[j] - profit[i];
				}
			}
		} 

		int maximum_profit = 0;
		for (int i = 0; i < total_days; i ++){
			for (int j = i ; j < total_days; j ++){
				if (maximum_profit < dp[i][j]){
					maximum_profit = dp[i][j];
				}
			}
		}
		
		return maximum_profit;
	}

	public static void main(String[] args){
		// Testing with one input 
		int[] profit = {7, 1, 5, 3, 6, 4};
		int maximum_profit = maxProfit(profit);
		System.out.println(maximum_profit);

		// Testing with another input 
		int[] profit2 = {7, 6, 4, 3, 1};
		int maximum_profit2 = maxProfit(profit2);
		System.out.println(maximum_profit2);
	}
}
