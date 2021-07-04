package leetcode;

import com.sun.scenario.effect.Merge;

import javax.crypto.Cipher;
import java.util.logging.Level;

public class _021合并两个有序链表 {
    public static void main(String[] args) {
        System.out.println("-");

        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode3 = new ListNode(3, listNode5);
        ListNode listNode1 = new ListNode(1, listNode3);

        ListNode listNode6 = new ListNode(6, null);
        ListNode listNode4 = new ListNode(4, listNode6);
        ListNode listNode2 = new ListNode(2, listNode4);


        ListNode listNode = mergeTwoLists(listNode1, listNode2);
        System.out.println(listNode);
        //curr
        //1 -> 3 --> 5
        //2 --> 4 --> 6
        //1 -->2
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dumpNode = new ListNode(0, null);
        ListNode curr = dumpNode;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            } else {
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            curr.next = l2;
        } else {
            curr.next = l1;
        }


        return dumpNode.next;
    }
}
