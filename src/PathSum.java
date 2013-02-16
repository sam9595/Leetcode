
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)
            return false;
        sum = sum - root.val;
        if(root.left == null && root.right == null){
            if(sum == 0)
                return true;
        }
        boolean boo1 = false;
        boolean boo2 = false;
        if(root.left != null){
            boo1 = hasPathSum(root.left,sum);
        }
        if(root.right!= null){
            boo2 = hasPathSum(root.right,sum);
        }
        return (boo1 || boo2);
            
    }
}
