package ru.vitaly;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 16.09.2021
 */
public class _101_SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    public static boolean compare(TreeNode o1, TreeNode o2) {
        if (o1 == null && o2 == null) return true;
        if (o1 == null || o2 == null) return false;
        if (o1.val != o2.val) return false;
        return compare(o1.left, o2.right) && compare(o1.right, o2.left);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}