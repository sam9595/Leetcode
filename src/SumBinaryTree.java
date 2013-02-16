import java.util.ArrayList;


public class SumBinaryTree {
    public static ArrayList<Integer> Recur_Sum(TreeNode node){
        int onesidesum = 0;
        int twosidesum = 0;
        ArrayList<Integer> sum  = new ArrayList<Integer>();
        if(node == null){
            sum.add(onesidesum);
            sum.add(twosidesum);
            return sum;
        }
        ArrayList<Integer> left = Recur_Sum(node.left);
        ArrayList<Integer> right = Recur_Sum(node.right);
        onesidesum = Math.max(node.val,node.val+Math.max(left.get(0),right.get(0)));
        if(node.left != null && node.right != null)
            twosidesum = Math.max(node.val+left.get(0)+right.get(0),Math.max(left.get(1),right.get(1)));
        else if(node.left != null)
            twosidesum = Math.max(onesidesum,left.get(1));
        else if(node.right != null)
            twosidesum = Math.max(onesidesum,right.get(1));
        else    
            twosidesum = onesidesum;
        sum.add(onesidesum);
        sum.add(twosidesum);
        System.out.println("val: " + node.val + "one: " + onesidesum + "two: " + twosidesum);
        return sum;
    }
    public static int maxPathSum(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> reply = Recur_Sum(root);
        return Math.max(reply.get(0),reply.get(1));
        }
    public static void main(String args[]){
    	TreeNode a = new TreeNode(5);
    	a.left = new TreeNode(4);
    	a.right = new TreeNode(8);
    	a.left.left = new TreeNode(11);
    	a.left.left.left = new TreeNode(7);
    	a.left.left.right = new TreeNode(2);
    	a.right.left = new TreeNode(13);
    	a.right.right = new TreeNode(4);
    	a.right.right.right = new TreeNode(1);
    	System.out.println(maxPathSum(a));
    }
}
