package leetcode;

public class _剑指52两个链表第一个公共节点 {
    public static void main(String[] args) {
        System.out.println("=--->");
        ListNode listNode15 = new ListNode(5, null);
        ListNode listNode14 = new ListNode(4, listNode15);
        ListNode listNode13 = new ListNode(8, listNode14);
        ListNode listNode12 = new ListNode(1, listNode13);
        ListNode listNode11 = new ListNode(4, listNode12);

        ListNode listNode0 = new ListNode(0, listNode12);
        ListNode listNode5 = new ListNode(5, listNode0);

        System.out.println("--->");
        ListNode intersectionNode = getIntersectionNode(listNode5, listNode11);
        System.out.println(intersectionNode);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode l1 = headA;
        ListNode l2 = headB;

        while (l1 != l2) {
            l1 = l1 != null ? l1.next : headB;
            l2 = l2 != null ? l2.next : headA;
        }

        return l1;
    }
}
