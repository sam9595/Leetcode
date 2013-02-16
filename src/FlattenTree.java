
public class FlattenTree {
    TreeNode last=null;
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        last = null;
        flatten2(root);
    }
    public void flatten2(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)
        	return;
    	flatten2(root.right);
    	flatten2(root.left);
    	root.right = last;
    	root.left = null;
    	last = root;
    }    
    public static void main(String args[]){
    	TreeNode root = new TreeNode(1);
    	root.right = new TreeNode(2);

    	FlattenTree f = new FlattenTree();
    	f.flatten(root);
    	root.print(root);
    }
}
