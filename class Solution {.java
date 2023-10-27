class Solution {
    public int maxDepth(TreeNoe root) {
       
        if(root == null) return 0;
       
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
       
        return Math.max(left, right) + 1;
    }
}