package com.javaclass.utils;

import com.javaclass.tree.TreeNode;

/**
 * 树相关的工具类
 */
public class TreeUtil {
    /**
     * 生成一棵由n个节点构成的二叉树，每个节点的取值为[1,100]
     *
     * @param n 要生成的二叉树的节点数
     * @return 生成二叉树的根节点
     */
    public static TreeNode randomBinaryTreeGenerator(int n) {
        if (n == 0) {
            return null;
        }
        int rootValue = (int) (Math.random() * 100);
        TreeNode root = new TreeNode(rootValue);
        int numsOfLeft = (int) (Math.random() * n);
        // 左子树有随机生成一个小于n的整数的结点数
        root.setLeftChild(randomBinaryTreeGenerator(numsOfLeft));
        // 右子树有n-1(根结点的个数)-numsOfLeft(左子树的个数)的结点数
        root.setRightChild(randomBinaryTreeGenerator(n - 1 - numsOfLeft));
        return root;
    }


}
