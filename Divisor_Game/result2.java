// My previous solution to this problem was a more non-deterministic approach
// The issue with that is since Leetcode already has a pre-prepared answer, it 
// becomes almost harder for it to be correct. Hence, what we will do here is 
// that we will hard code this and consider if, Alice is to win, our n must 
// always be divisible by 2. 

class Solution2{
	public static boolean divisorGame(int n){
		return (n % 2 == 0);
	}

	public static void main(String[] args){
		System.out.println(divisorGame(8));
	}
}
