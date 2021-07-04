package leetcode;

import java.util.Arrays;

public class _剑指57和为s的两个数字 {
    public static void main(String[] args) {
        System.out.println("---》");
        int[] nums = new int[]{2, 7, 11, 15};
        int[] ints = twoSum(nums, 9);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;

        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                right++;
            } else {
                return new int[]{nums[left], nums[right]};
            }
        }

        return new int[]{};
    }
}
