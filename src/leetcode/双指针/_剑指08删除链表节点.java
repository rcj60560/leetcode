package leetcode.双指针;

import leetcode.ListNode;

public class _剑指08删除链表节点 {
    public static void main(String[] args) {
        System.out.println("___>");

        ListNode listNode9 = new ListNode(9, null);
        ListNode listNode1 = new ListNode(1, listNode9);
        ListNode listNode5 = new ListNode(5, listNode1);
        ListNode listNode4 = new ListNode(4, listNode5);

        ListNode listNode = deleteNode(listNode4, 1);
        System.out.println(listNode);
    }

    public static ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode pre = head;
        ListNode curr = head.next;

        while (curr != null && curr.val != val) {
            pre = curr;
            curr = curr.next;
        }

        if (curr != null) pre.next = curr.next;
        return head;
    }
}
