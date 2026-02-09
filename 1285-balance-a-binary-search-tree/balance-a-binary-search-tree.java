/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public void inorder(TreeNode node , List<Integer> inorder){
    if(node == null){
      return;
    }
    inorder(node.left , inorder);
    inorder.add(node.val);
    inorder(node.right , inorder);
  }
  public TreeNode Solve(List<Integer> inorder , int l , int r){
    if(l > r){
      return null;
    }
    int mid = l + (r-l)/2;
    TreeNode node = new TreeNode(inorder.get(mid));
    node.left = Solve(inorder , l , mid - 1);
    node.right = Solve(inorder , mid + 1 , r);
    return node;
  }
  public TreeNode balanceBST(TreeNode root) {
    List<Integer> vals = new ArrayList<>();
        inorder(root, vals);
        return Solve(vals, 0, vals.size() - 1);    
    }
}