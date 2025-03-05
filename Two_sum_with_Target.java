package leetCode;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class Two_sum_with_Target {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		// Iterate through the array
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i]; // Find the required complement

			if (map.containsKey(diff)) {
				return new int[]{map.get(diff), i}; // Return indices if complement is found
			}
			map.put(nums[i], i); // Store number and its index in the map
		}
		throw new IllegalArgumentException("No solution found"); // Should never happen as per the problem statement
	}

	public static void main(String[] args) {
		int[] nums = {1, 8, 2, 15, 5};
		int target = 13;

		int[] result = twoSum(nums, target);
		System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	}

}

