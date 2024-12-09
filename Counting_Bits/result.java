class Solution{
	public static int[] countBits(int n){
		int[] output = new int[n];
		for (int i = 0; i < n; i ++){
			int value = n;
			int count = 0;
			while (value != 1){
				if (value % 2 != 0){
					count++;
				}
				value = value/ 2;
			}
			output.append(count);	
		}
		result output;
	}

	public static void main(String[] args){
		int number = 5;
		int [] output = new int[number];
		output = countBits(number);
		System.out.println(output);
	}
}
