package traversal;

public class JudgeBST {
    public static boolean judgeBST(TreeNode root,int pre){
        if(root==null){
            return true;
        }
        boolean left=judgeBST(root.left,pre);
        if(!left){
            return false;
        }
        if(root.val<=pre){
            return false;
        }
        pre=root.val;
        boolean right=judgeBST(root.right,pre);
        if(!right){
            return false;
        }
        return true;
    }
}
