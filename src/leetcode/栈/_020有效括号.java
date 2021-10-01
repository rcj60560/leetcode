package leetcode.栈;

import leetcode.ListNode;

import java.util.HashMap;
import java.util.Stack;

public class _020有效括号 {
    public static void main(String[] args) {
        System.out.println("--");
        HashMap<Character, Character> pairs = new HashMap<Character,Character>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};

        boolean b = pairs.containsKey('[');
        boolean b1 = pairs.containsKey(']');
        System.out.println(b1);
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        HashMap<Character, Character> pairs = new HashMap<Character,Character>(){{
            put('(',')');
            put('[',']');
            put('{','}');
        }};
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (pairs.containsKey(charAt)){
                if (stack.isEmpty() || stack.peek()!= pairs.get(charAt)){
                    return false;
                }
                stack.push(charAt);
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
