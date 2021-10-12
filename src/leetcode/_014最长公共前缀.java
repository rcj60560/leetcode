package leetcode;

public class _014最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "floight"};
//        String[] strs = {"f"};
//        String[] strs = {};
        String s = longestCommonPrefix(strs);
        System.out.println("result:" + s);
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = getCommonFix(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }

        return prefix;
    }

    private static String getCommonFix(String str1, String str2) {
        int index = 0;
        int end = Math.min(str1.length(), str2.length());
        while (index < end && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }

//    private static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return null;
//        String prefix = strs[0];
//        for (int i = 1; i < strs.length; i++) {
//            prefix = longestCommonPrefix(prefix, strs[i]);
//            if (prefix.length() == 0) {
//                break;
//            }
//        }
//        return prefix;
//    }
//
//    private static String longestCommonPrefix(String str1, String str2) {
//        int n = Math.min(str1.length(), str2.length());
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            while (index < n && (str1.charAt(index) == str2.charAt(index))) {
//                index++;
//            }
//        }
//        return str1.substring(0, index);
//    }
}
