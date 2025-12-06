/* 114. Flatten Binary Tree to Linked List
   -> 1st Attempt TC ~ O(N) , SC ~ O(N)
*/

import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class prog68 {
    public static void preOrder(TreeNode root, LinkedList<Integer> l) {
        if (root == null)
            return;
        l.add(root.val);
        preOrder(root.left, l);
        preOrder(root.right, l);
    }

    public static void flatten(TreeNode root) {
        if (root == null)
            return;
        LinkedList<Integer> l = new LinkedList<>();
        preOrder(root, l);
        l.removeFirst();
        TreeNode temp = root;
        for (int values : l) {
            temp.left = null;
            temp.right = new TreeNode(values);
            temp = temp.right;
        }
        return;
    }
}
