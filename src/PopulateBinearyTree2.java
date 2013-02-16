
public class PopulateBinearyTree2 {
    public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)
            return;
        TreeLinkNode p = root;
        while(p!=null){
            if(p.left!=null){
                if(p.right!=null)
                    p.left.next = p.right;
                else{
                    TreeLinkNode p2 = p.next;
                    while(p2!=null){
                        if(p2.left!=null){
                            p.left.next = p2.left;
                            break;
                        }
                        if(p2.right!=null){
                            p.left.next = p2.right;
                            break;
                        }
                        p2 = p2.next;
                    }
                    p = p2;
                    continue;
                }    
            }
            if(p.right!=null){
                TreeLinkNode p2 = p.next;
                while(p2!=null){
                    if(p2.left!=null){
                        p.right.next = p2.left;
                        break;
                    }
                    if(p2.right!=null){
                        p.right.next = p2.right;
                        break;
                    }
                    p2 = p2.next;
                }
                p = p2;
                continue;
            }
        }
        p = root;
        while(p!=null){
            if(p.left!=null){
                connect(p.left);
                break;
            }
            if(p.right!=null){
                connect(p.right);
                break;
            }
            p = p.next;
        }
    }
}
