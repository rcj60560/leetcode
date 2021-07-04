package leetcode;

import sun.nio.cs.ext.SJIS;

import java.util.Arrays;

public class _剑指21调整数组顺序使奇数在偶数前面 {
    public static void main(String[] args) {
        System.out.println("---<" + 5 % 2);
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] exchange = exchange(nums);
        System.out.println(Arrays.toString(exchange));

    }

    public static int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) return new int[]{};
        int temp = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 == 1) left++;
            while (left < right && nums[right] % 2 == 0) right--;
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
