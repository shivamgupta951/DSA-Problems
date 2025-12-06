    /* 100. Same Tree
    Given the roots of two binary trees p and q, write a function to check 
    if they are the same or not.Two binary trees are considered the same if they are 
    structurally identical, and the nodes have the same value.
    -> 1st Attempt 
    */

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

    public class prog69 {
        public static boolean checkTree(TreeNode t1 , TreeNode t2)
        {
            if(t1==null && t2==null) return true;
            else if(t1!=null && t2==null) return false;
            else if(t2!=null && t1==null) return false;
            if(t1.val!=t2.val) return false;
            return checkTree(t1.left, t2.left) && checkTree(t1.right, t2.right);
        }
        public static boolean isSameTree(TreeNode p, TreeNode q) {
            return checkTree(p, q);
        }
    }
