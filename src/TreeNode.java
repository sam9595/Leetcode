 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      public void print(TreeNode root){
    	  if(root == null){
    		  System.out.print(",#,");
    		  return;
    	  }
    	  else{
    		  System.out.print("," + root.val + ",");
    	  }
    	  print(root.left);
    	  print(root.right);
      }
  }