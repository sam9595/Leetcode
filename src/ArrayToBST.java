
public class ArrayToBST {
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	TreeNode root = null;
    	root = insert(num,0,num.length-1);
    	return root;
    }
    public TreeNode insert(int[] num, int start, int end){
    	if(start > end)
    		return null;
    	int mid = (start + end) / 2;
    	TreeNode root = new TreeNode(num[mid]);
    	root.left = insert(num,start,mid - 1);
    	root.right = insert(num,mid+1,end);
    	return root;    	
    }
    public static void main(String args[]){
    	int[] num = {1,2,3,4,5,6,7,8};
    	ArrayToBST a = new ArrayToBST();
    	TreeNode b= a.sortedArrayToBST(num);
    	b.print(b);
    }
}
