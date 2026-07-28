1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public void preorder(TreeNode root, ArrayList<Integer> l) {
18        if (root == null)
19            return;
20        l.add(root.val);
21        preorder(root.left, l);
22        preorder(root.right, l);
23    }
24
25    public void flatten(TreeNode root) {
26        ArrayList<Integer> l = new ArrayList<>();
27        preorder(root, l);
28        for(int i=1; i<l.size(); i++)
29        {
30            root.right = new TreeNode(l.get(i));
31            root.left = null;
32            root = root.right;
33        }
34        return;
35    }
36}