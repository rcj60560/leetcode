package leetcode;

import java.util.*;

/**
 *                  1
 * <p>
 *          2            3
 * <p>
 *      4        5    6
 * <p>
 * 前序 根左右 --->>>       124536
 * 中序 左根右 --->>>       425163
 * 后序 左右根 --->>>       452631
 */

public class _094二叉树的中序遍历 {
    public static void main(String[] args) {
        TreeNode treeNode6 = new TreeNode(6, null, null);
        TreeNode treeNode5 = new TreeNode(5, null, null);
        TreeNode treeNode4 = new TreeNode(4, null, null);
        TreeNode treeNode3 = new TreeNode(3, treeNode6, null);
        TreeNode treeNode2 = new TreeNode(2, treeNode4, treeNode5);
        TreeNode treeNode1 = new TreeNode(1, treeNode2, treeNode3);

//        List<Integer> integers = inorderTraversal1(treeNode1);
//        System.out.println("中序迭代："+integers);
//        ArrayList<Integer> integers = preorderTraversal1(treeNode1);
//        System.out.println("前序迭代：" + integers);
        List<Integer> integers = postorderTraversal(treeNode1);
        System.out.println(integers);
    }

    /**
     * 后续遍历
     * @param root
     * @return
     *
     *               1
     *          2         3
     *       4     5   6
     * <p>
     */

    private static List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//        if (root == null) {
//            return res;
//        }
//
//        Deque<TreeNode> stack = new LinkedList<TreeNode>();
//        TreeNode prev = null;
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            if (root.right == null || root.right == prev) {
//                res.add(root.val);
//                prev = root;
//                root = null;
//            } else {
//                stack.push(root);
//                root = root.right;
//            }
//        }
//        return res;

        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == pre) {
                res.add(root.val);
                pre = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return res;
    }

    /**
     * 前序 迭代
     *
     * @param root
     * @return 1
     * 2            3
     * 4        5    6
     * <p>
     * 124536
     */
    private static ArrayList<Integer> preorderTraversal1(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return res;
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }

    /**
     * 前序递归
     *
     * @param root
     * @return
     */
    private static ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private static void preorder(TreeNode root, ArrayList<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }

    /**
     * 1
     * <p>
     * 2            3
     * <p>
     * 4        5    6
     * 425163
     */
    private static List<Integer> inorderTraversal1(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            integers.add(root.val);
            root = root.right;
        }
        return integers;
    }

    /**
     * 递归
     *
     * @param root
     * @return
     */

    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> integers = new ArrayList<>();
        inorder(root, integers);
        return integers;
    }

    private static void inorder(TreeNode root, ArrayList<Integer> integers) {
        if (root == null) return;
        inorder(root.left, integers);
        integers.add(root.val);
        inorder(root.right, integers);
    }
}
