package ru.vitaly;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.vitaly._101_SymmetricTree.TreeNode;
import static ru.vitaly._101_SymmetricTree.isSymmetric;

/**
 * @author Vitaly Vasilyev, e-mail: rav.energ@rambler.ru
 * @version 1.0
 * @since 16.09.2021
 */
public class _101_SymmetricTreeTest {
    @Test
    public void test1() {
        TreeNode two_l = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode two_r = new TreeNode(2, new TreeNode(4), new TreeNode(3));
        TreeNode head = new TreeNode(1, two_l, two_r);
        assertTrue(isSymmetric(head));
    }

    @Test
    public void test2() {
        TreeNode two_l = new TreeNode(2, null, new TreeNode(3));
        TreeNode two_r = new TreeNode(2, null, new TreeNode(3));
        TreeNode head = new TreeNode(1, two_l, two_r);
        assertFalse(isSymmetric(head));
    }
}