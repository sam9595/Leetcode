
public class LinkedListBST {
	public TreeNode insert(TreeNode root, int val){
    	if(root == null){
    		root = new TreeNode(val);    
    		return root;
    	}
    	if(depth(root.left) < depth(root.right)){
    		TreeNode temp = root;
    		root = root.right;
    		root.left = temp;
    		temp.right = null;
    	}
    	root.right = insert(root.right,val);
    	return root;
	}
	public int depth(TreeNode node){
		if(node == null)
			return 0;
		return 1 + Math.max(depth(node.left), depth(node.right));
	}
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        TreeNode root = null;
        while(head != null){
        	root = insert(root,head.val);        
        	head = head.next;
        }
        return root;
    }
    public static void main(String args[]){
    	LinkedListBST b = new LinkedListBST();
    	ListNode a = new ListNode(1);
    	ListNode a2 = a;
    	for(int i = 0 ; i < 5 ; i++){
    		a.next = new ListNode(i+2);
    		a = a.next;
    	}
    	TreeNode t = b.sortedListToBST(a2);
    	t.print(t);
    }
}
