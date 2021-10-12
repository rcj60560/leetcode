package leetcode.双指针;

public class _704二分查找 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        search(ints, 2);
    }

    private static int search(int[] ints, int target) {
        int low = 0;
        int height = ints.length - 1;
        while (low <= height) {
            int mid = (height - low) / 2 + low;
            int midNum = ints[mid];
            if (midNum == target) {
                return mid;
            } else if (midNum > target) {
                height = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
