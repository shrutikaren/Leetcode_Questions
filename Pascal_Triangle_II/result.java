import java.util.List;
import java.util.ArrayList;

class Solution{
	public static List<List<Integer>> generate (int numRows){
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < numRows; i ++){
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < i + 1; j ++){
				if (j == 0 || j == i){
					row.add(1);
				}
				else{
					int value = result.get(i-1).get(j-1) + result.get(i-1).get(j);
					row.add(value);
				}
			}
			result.add(row);
		}
		return result;
	}
	public static void main(String[] args){
		int rowIndex = 5;
		List<List<Integer>> result = new ArrayList<>();
		result = generate(rowIndex);
		List<Integer> row = result.get(rowIndex-1);
		System.out.println(row);
	}
}
