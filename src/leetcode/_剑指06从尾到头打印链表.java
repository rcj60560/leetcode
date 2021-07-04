package leetcode;

public class _剑指06从尾到头打印链表 {
    public static void main(String[] args) {
        System.out.println("---<");
//        ListNode listNode4 = new ListNode(4, null);
//        ListNode listNode3 = new ListNode(3, listNode4);
//        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, null);

        int[] ints = reversePrint(listNode1);
        System.out.println(ints);

    }

    private static int[] reversePrint(ListNode node) {
        if (node == null) {
            return new int[]{};
        }
        ListNode listNode = node;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        int[] nodeInt = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            nodeInt[i] = listNode.val;
            listNode = listNode.next;
        }

        return nodeInt;
    }
}
