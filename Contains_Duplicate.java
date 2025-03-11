package leetCode;

import java.util.HashSet;

public class Contains_Duplicate {
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> visited = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (visited.contains(nums[i])) {
				return true;
			}
			else {
				visited.add(nums[i]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		System.out.println("the given number is duplicate : "+containsDuplicate(nums)); // Output: true
	}

}
