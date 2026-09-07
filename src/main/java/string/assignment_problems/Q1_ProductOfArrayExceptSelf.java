package string.assignment_problems;

public class Q1_ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int leftProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] answer = productExceptSelf(nums);

        for (int value : answer) {
            System.out.print(value + " ");
        }
    }
}