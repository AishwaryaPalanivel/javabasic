package leetCode;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class Two_sum_with_Target {

	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through given input
        for (int i = 0; i < nums.length; i++) {
            // Calculate the difference
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null; // Return null if no pair found
    }

    public static void main(String[] args) {
        int[] nums = {1,8,2,15,5};
        int target = 13;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid pair found.");
        }
    }
}


