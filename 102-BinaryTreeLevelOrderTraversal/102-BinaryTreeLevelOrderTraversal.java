// Last updated: 14/07/2026, 14:02:53
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
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        if(root==null) return ans;
        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            List<Integer> subAns=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode peek=qu.poll();
                subAns.add(peek.val);
                if(peek.left!=null){
                    qu.add(peek.left);
                }if(peek.right!=null){
                    qu.add(peek.right);
                }
            }ans.add(subAns);
        }return ans;
    }
}