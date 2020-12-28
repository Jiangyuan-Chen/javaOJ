package com.javaclass.utils;
import java.util.Scanner;

public class subTreeStructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();










        input.close();
    }

    public static class TreeNode {
        private int val; // 该节点的value
        private TreeNode leftChild; // 左子树对应的root
        private TreeNode rightChild; // 右子树对应的root

        /**
         * 构造方法
         *
         * @param val root节点对应的值
         */
        public TreeNode(int val) {
            this.val = val;
            this.leftChild = null;
            this.rightChild = null;
        }

        /**
         * 打印以该节点为root的二叉树
         *
         * @param prefix
         * @param isTail
         * @param sb
         * @return
         */
        public StringBuilder toString(StringBuilder prefix, boolean isTail, StringBuilder sb) {
            if (rightChild != null) {
                rightChild.toString(new StringBuilder().append(prefix).append(isTail ? "│   " : "    "), false, sb);
            }
            sb.append(prefix).append(isTail ? "└── " : "┌── ").append(val).append("\n");
            if (leftChild != null) {
                leftChild.toString(new StringBuilder().append(prefix).append(isTail ? "    " : "│   "), true, sb);
            }
            return sb;
        }

        @Override
        public String toString() {
            return this.toString(new StringBuilder(), true, new StringBuilder()).toString();
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }

        public TreeNode getRightChild() {
            return rightChild;
        }

        public void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }
    }

    public static TreeNode binaryTreeGenerator(int n, Scanner input){
        int rootValue =input.nextInt();
        TreeNode root = new TreeNode(rootValue);
        int numsOfLeft = input.nextInt();
        root.setLeftChild(binaryTreeGenerator(numsOfLeft,input));
        root.setRightChild(binaryTreeGenerator(n - 1 - numsOfLeft, input));
        return root;
    }

}
