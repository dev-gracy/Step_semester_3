package string.assignment_problems;

import java.util.HashMap;

public class Q4_SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumFrequency = new HashMap<>();

        prefixSumFrequency.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            if (prefixSumFrequency.containsKey(currentSum - k)) {
                count += prefixSumFrequency.get(currentSum - k);
            }

            prefixSumFrequency.put(
                currentSum,
                prefixSumFrequency.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println("Number of Subarrays: " + result);
    }
}