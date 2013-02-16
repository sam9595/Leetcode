import java.util.ArrayList;
import java.util.Stack;;
public class PathSumII {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack st = new Stack();
        ArrayList<ArrayList<Integer>> alist = pathSum(root,sum,st);
        return alist;
    }
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum , Stack st){
        ArrayList<ArrayList<Integer>> alist = new ArrayList<ArrayList<Integer>> ();
        if(root == null)
        	return alist;
        st.push(root.val);
        sum -= root.val;
        if(sum == 0 && root.left == null && root.right == null){
            alist.add(new ArrayList<Integer>(st));
        }
        ArrayList<ArrayList<Integer>> llist = null;
        ArrayList<ArrayList<Integer>> rlist = null;
        if(root.left != null)
        	llist = pathSum(root.left,sum,st);
        if(root.right!=null)    
        	rlist = pathSum(root.right,sum,st);        
        st.pop();
        if(llist!=null)
        	alist.addAll(llist);
        if(rlist !=null)
        	alist.addAll(rlist);
        return alist;
    }
    public static void main(String args[]){
    	PathSumII p = new PathSumII();
    	TreeNode root = null;
    	//TreeNode root = new TreeNode(1);
    	//root.left = new TreeNode(2);
    	//root.right = new TreeNode(2);
    	System.out.println(p.pathSum(root, 3));
    }
}
