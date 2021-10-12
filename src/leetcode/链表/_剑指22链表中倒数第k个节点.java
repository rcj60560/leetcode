package leetcode.链表;

import leetcode.ListNode;

import java.util.Arrays;

public class _剑指22链表中倒数第k个节点 {
    public static void main(String[] args) {
        ListNode listNode6 = new ListNode(6, null);
        ListNode listNode5 = new ListNode(5, listNode6);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode kthFromEnd = getKthFromEnd(listNode1, 2);
//        ListNode kthFromEnd = getKthFromEnd1(listNode1, 2);
        System.out.println(kthFromEnd);
    }

    private static ListNode getKthFromEnd1(ListNode head, int k) {
        ListNode curr = head;
        ListNode pre = head;

        for (int i = k; i > 0; i--) {
            curr = curr.next;
        }

        while (curr != null) {
            curr = curr.next;
            pre = pre.next;
        }


        return pre;
    }


    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur = head;
        ListNode pre = head;
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }

        while (cur!=null){
            pre = pre.next;
            cur = cur.next;
        }

        return pre;
    }
}
