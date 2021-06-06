package leetcode;

import java.util.zip.CRC32;

public class _013罗马数字转整数 {
    public static void main(String[] args) {
        System.out.println("start->");
        String s = "III";
//        String s = "MCMXCIV";

        int i = romanToInt(s);
    }

    private static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                sum += getInt(String.valueOf(s.charAt(s.length() - 1)));
                return sum;
            }

            int curr = getInt(String.valueOf(s.charAt(i)));
            int next = getInt(String.valueOf(s.charAt(i + 1)));

            if (curr < next) {
                sum += -curr ;
            } else {
                sum += curr;
            }


        }

        return sum;
    }

    public static int getInt(String roma) {
        switch (roma) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return -1;
        }
    }
}
