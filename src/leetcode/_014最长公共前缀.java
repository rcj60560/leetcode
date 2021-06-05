package leetcode;

public class _014最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"f"};
//        String[] strs = {};
        String s = longestCommonPrefix(strs);
        System.out.println("result:" + s);
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }

        String preFix = strs[0];
        int n = strs.length;

        for (int i = 1; i < n; i++) {
            preFix = longestCommonPrefix(preFix, strs[i]);
            if (preFix.length() == 0) {
                break;
            }
        }

        return preFix;
    }

    private static String longestCommonPrefix(String preFix, String str) {
        int length = Math.min(preFix.length(), str.length());
        int index = 0;
        while (index < length && (preFix.charAt(index) == str.charAt(index))) {
            index++;
        }
        return preFix.substring(0, index);
    }
}
