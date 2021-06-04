package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class _001两数之和 {
    public static void main(String[] args) {
//        int[] nums = new int[]{2, 7, 11, 15};
//        int target = 18;

        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ints = twoSum(nums, target);

        System.out.println(Arrays.toString(ints));

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result) && map.get(result) != i) {
                return new int[]{i, map.get(result)};
            }
        }

        return null;
    }
}
