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
17    public int solve(TreeNode root , int currPrev ,int grandPrev)
18    {
19        if(root == null) return 0;
20        int val = 0;
21        if(grandPrev%2==0) val = root.val;
22        grandPrev = currPrev;
23        currPrev = root.val;
24        int left = solve(root.left,currPrev,grandPrev);
25        int right = solve(root.right,currPrev,grandPrev);
26        return left + right + val;
27    }
28    public int sumEvenGrandparent(TreeNode root) {
29        return solve(root,-1,-1);
30    }
31}