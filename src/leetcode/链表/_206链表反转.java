package leetcode.链表;

import leetcode.ListNode;

import java.util.zip.CRC32;

public class _206链表反转 {

    //Test branch
    //test1
    public static void main(String[] args) {

        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode reverseListNode = reverseListNode(node1);
        System.out.println("---》" + reverseListNode);
    }

    private static ListNode reverseListNode(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}


