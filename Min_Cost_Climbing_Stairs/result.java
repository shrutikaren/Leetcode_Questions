import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution{
	public static int minCostClimbingStairs(int[] cost_old){
		int n = cost_old.length;
		int minimum;
		if (cost_old.length == 0){
			return 0;
		}
		else if (cost_old.length == 1){
			return cost_old[0];
		}
		else{
			// This is the case where the list is greater or equals to 2
			int[] dp = new int[cost_old.length + 1]; // Extra step to get to the top
			dp[0] = 0;
			dp[1] = 0;
			for (int i = 2; i <= n; i ++){
				minimum = Math.min(dp[i-1] + cost_old[i-1], dp[i-2] + cost_old[i-2]);
				dp[i] = minimum;	
			}
			return dp[n];
		}
	
	
	}

	public static void main(String[] args){
		int[] cost = {10, 15, 20};
		int output = minCostClimbingStairs(cost);
		System.out.println(output);
	}

}
