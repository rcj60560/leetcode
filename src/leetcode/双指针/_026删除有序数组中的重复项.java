package leetcode.双指针;

public class _026删除有序数组中的重复项 {
    public static void main(String[] args) {
        System.out.println("start->");
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = new int[]{1, 1, 2};

        int i = removeDuplicates(nums);
        System.out.println("length:" + i);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int fast = 1;
        int slow = 1;
        int n = nums.length;
        while (fast<n){
            if (nums[fast] != nums[fast-1]){
                nums[slow ]= nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;


//        if (nums.length == 0 || nums == null) {
//            return 0;
//        }
//
//        int fast = 1;
//        int slow = 1;
//        int n = nums.length;
//
//        while (fast < n) {
//            if (nums[fast] != nums[fast - 1]) {
//                nums[slow] = nums[fast];
//                slow++;
//            }
//            fast++;
//        }
//        return slow;
    }
}
