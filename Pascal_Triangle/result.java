import java.util.List;
import java.util.ArrayList;

class Solution{
	public static List<List<Integer>> generate(int numRows){
		List<List<Integer>> newlist = new ArrayList<>();
		for (int i = 0; i < numRows; i ++){
			List<Integer> newrow = new ArrayList<>();
			for (int j = 0; j <= i ; j ++){
				if (j == 0 | j == i){
					newrow.add(1);
				}
				else{
					int value_obtained = newlist.get(i-1).get(j-1) + newlist.get(i-1).get(j);
					newrow.add(value_obtained);
				}
			}
			newlist.add(newrow);
		}
		return newlist;
	}

	public static void main(String[] args){
		int number = 5;
		List<List<Integer>> newlist = new ArrayList<>();
		newlist = generate(number);
		System.out.println(newlist);

	}
}
