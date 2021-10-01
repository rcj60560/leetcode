package leetcode.链表;

import leetcode.ListNode;

public class _141环形链表 {
    public static void main(String[] args) {

        System.out.println("--");
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast!=slow){
            if (fast==null || fast.next==null){
                return false;
            }

            fast = fast.next.next;
            slow = slow.next;

        }

        return true;
    }
}
