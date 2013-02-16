import java.util.ArrayList;


public class PopulateBinaryTree {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<TreeLinkNode> TreeList1 = new ArrayList<TreeLinkNode>();   
        ArrayList<TreeLinkNode> TreeList2 = new ArrayList<TreeLinkNode>();
        if(root == null)
            return;
        root.next = null;
        TreeList1.add(root);
        while(TreeList1.size() > 0){
            TreeList2 = new ArrayList<TreeLinkNode>();
            int i;
            for(i = 0 ; i < TreeList1.size() ; i++){
                if(TreeList1.get(i).left == null)
                    break;
                TreeList1.get(i).left.next = TreeList1.get(i).right;
                if(i == TreeList1.size() - 1)
                    TreeList1.get(i).right.next = null;
                else    
                    TreeList1.get(i).right.next = TreeList1.get(i+1).left;
                TreeList2.add(TreeList1.get(i).left);
                TreeList2.add(TreeList1.get(i).right);
            }
            TreeList1 = (ArrayList<TreeLinkNode>)TreeList2.clone();
        }
    }
}
