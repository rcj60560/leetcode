package leetcode;

public class _027移除元素 {
    public static void main(String[] args) {
        System.out.println("start-> 027");
//        int[] nums = new int[]{3, 2, 2, 3};
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int i = removeElement(nums, 2);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int fast = 0;
        int slow = 0;
        int n = nums.length;
        while (fast < n) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;

        }
        return slow;
    }
}
