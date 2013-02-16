import java.util.ArrayList;


public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int c = Balanced(root);
        if( c >= 0)
            return true;
        return false;    
    }
    public int Balanced(TreeNode root){
        if(root == null)
            return 0;
        int a = Balanced(root.left);
        int b = Balanced(root.right);
        if(a < 0 || b < 0)
            return -1;
        if(Math.abs(a-b) >= 2)
            return -1;
        else{
            return 1 + Math.max(a,b);
        }    
    }
    public static void main(String args[]){
    	//TreeNode a=null;
    	TreeNode a = new TreeNode(5);
    	a.left = new TreeNode(4);
    	a.left.left = new TreeNode(4);
    	//a.right = new TreeNode(8);
    	/*a.left.left = new TreeNode(11);
    	a.left.right= new TreeNode(11);
    	a.left.left.left= new TreeNode(11);
    	a.left.left.right= new TreeNode(11);
    	a.left.left.left.left= new TreeNode(11);
    	a.left.left.left.right= new TreeNode(11);
    	a.left.right.left= new TreeNode(11);
    	a.left.right.right= new TreeNode(11);
    	a.right= new TreeNode(11);
    	a.right.left= new TreeNode(11);
    	a.right.right= new TreeNode(11);
    	a.right.left.left= new TreeNode(11);
    	a.right.left.right= new TreeNode(11);
    	*//*a.left.left.left = new TreeNode(7);
    	a.left.left.left.left = new TreeNode(4);
    	a.left.left.right = new TreeNode(2);
    	a.right.left = new TreeNode(13);
    	a.right.right = new TreeNode(4);
    	a.right.right.right = new TreeNode(1);
    	*/BalancedBinaryTree b = new BalancedBinaryTree();
    	boolean bl = b.isBalanced(a);
    	System.out.println(bl);
    }
}
