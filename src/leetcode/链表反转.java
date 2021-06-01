package leetcode;

public class 链表反转 {

    //Test branch
    //test1
    public static void main(String[] args) {
        System.out.println("=========================start=========================");
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);


        ListNode listNode = reverseList(node1);
        System.out.println("end");


    }

    private static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next;
        ListNode cur = head;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;

    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }
}

