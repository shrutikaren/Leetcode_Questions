import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Solution{
	public static int[] countBits(int n){
		List<Integer> output = new ArrayList<>();
		for (int i = 0; i <= n; i ++){
			int value = i;
			int count = 0;
			while (value > 0){
				if (value % 2 != 0){
					count++;
				}
				value = value/ 2;
			}
			output.add(count);
			System.out.println(output);	
		}
		int[] output_int = output.stream().mapToInt(Integer::intValue).toArray();
		return output_int;
	}

	public static void main(String[] args){
		int number = 5;
		int [] output = new int[number];
		output = countBits(number);
		System.out.println(Arrays.toString(output));
	}
}
