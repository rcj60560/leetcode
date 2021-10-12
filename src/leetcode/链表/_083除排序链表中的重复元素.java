package leetcode.链表;

import leetcode.ListNode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;

public class _083除排序链表中的重复元素 {
    public static void main(String[] args) {
//        1 1 3 4
        ListNode listNode4 = new ListNode(4, null);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode1 = new ListNode(1, listNode3);
        ListNode listNode0 = new ListNode(1, listNode1);
        ListNode listNode = deleteDuplicates(listNode0);
        System.out.println(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        while (curr.next!=null){
            if (curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else {
                curr = curr.next;
            }
        }
        return head;
    }
}
