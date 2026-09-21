import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int val) {
        this.value = val;
    }

    TreeNode(TreeNode l, TreeNode r, int v) {
        this.left = l;
        this.right = r;
        this.value = v;
    }
}

public class prog117 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.right = node6;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int max = Integer.MIN_VALUE;
        // level order traversal
        while (!q.isEmpty()) {
            int len = q.size();
            max = Math.max(len, max);
            for (int i = 0; i < len; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null)
                    q.offer(curr.left);
                if (curr.right != null)
                    q.offer(curr.right);
            }
        }

        System.out.println(max);
    }
}