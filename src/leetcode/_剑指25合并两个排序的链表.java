package leetcode;

import java.util.Arrays;

public class _剑指25合并两个排序的链表 {
    public static void main(String[] args) {

        ListNode listNode14 = new ListNode(4, null);
        ListNode listNode12 = new ListNode(2, listNode14);
        ListNode listNode11 = new ListNode(1, listNode12);


        ListNode listNode4 = new ListNode(4, null);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode1 = new ListNode(1, listNode3);

        ListNode listNode = mergeTwoLists(listNode1, listNode11);
        System.out.println(listNode);

        // 1 2 4
        // 1 3 4

//        curr

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dump = new ListNode();
        ListNode curr = dump;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }
        return dump.next;
    }
}
