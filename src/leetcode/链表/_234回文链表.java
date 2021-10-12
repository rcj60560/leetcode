package leetcode.链表;

import leetcode.ListNode;

import java.lang.annotation.Target;
import java.util.Stack;

public class _234回文链表 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return true;
        Stack<ListNode> stack = new Stack<>();

        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        while (head!=null){
            ListNode pop = stack.pop();
            if (pop.val!=head.val){
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
