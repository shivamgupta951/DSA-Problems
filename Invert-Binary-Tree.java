1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode node1;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode node1, TreeNode right) {
10 *         this.val = val;
11 *         this.node1 = node1;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    
18    public TreeNode invertTree(TreeNode root) {
19        if(root==null) return root;
20        TreeNode temp = root.left;
21        root.left = root.right;
22        root.right = temp;
23        invertTree(root.left);
24        invertTree(root.right);
25        return root;
26    }
27}