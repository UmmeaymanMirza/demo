import com.sun.source.tree.Tree;

class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p!=null && q!= null) {

            return p.val == q.val && p.left.val == q.left.val && p.right.val == q.right.val;
        }
    return false;
    }



    public static void main(String[] args) {
        // Output: [1, 0, 0, 2, 3, 0, 0, 4]

       TreeNode p = new TreeNode(1, new TreeNode(2),new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1),new TreeNode(2));
        System.out.println("result:==>"+isSameTree(p,q));
    }


}

