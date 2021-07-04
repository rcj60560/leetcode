package leetcode;

import java.util.Arrays;

public class _剑指58_1翻转单词顺序 {
    public static void main(String[] args) {
        System.out.println("__.");
        String str = "the sky is blue";
        String s = reverseWords(str);
        System.out.println("s:" + s);

    }

    public static String reverseWords(String s) {
        String trim = s.trim();
        int length = trim.length() - 1;
        int fast = length;
        int slow = length;
        StringBuilder sb = new StringBuilder();
        while (fast >= 0) {
            while (fast >= 0 && trim.charAt(fast) != ' ') fast--;
            sb.append(trim.substring(fast + 1, slow + 1) + " ");
            while (fast >= 0 && trim.charAt(fast) == ' ') fast--;
            slow = fast;
        }
        return sb.toString();
    }
}
