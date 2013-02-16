
public class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode root;
        ListNode curr;
        int v1 = 0,v2 = 0;
        if(l1 == null && l2 == null)
            return null;
        if(l1 != null){
            v1 = l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            v2 = l2.val;
            l2 = l2.next;
        }
        root = new ListNode( (v1 + v2) %10);
        curr = root;            
        
        int overflow = ( (v1 + v2) / 10);
        while(l1!= null && l2 != null){
            int val = (l1.val + l2.val + overflow) % 10 ;
            overflow = (l1.val + l2.val + overflow) / 10;
            curr.next = new ListNode(val);
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }
        while(l1!=null){
            int val = (l1.val + overflow) % 10;
            overflow = (l1.val + overflow) / 10;
            curr.next = new ListNode(val);
            l1 = l1.next;
            curr = curr.next;
        }
        while(l2 != null){
            int val = (l2.val + overflow) % 10;
            overflow = (l2.val + overflow) / 10 ;
            curr.next = new ListNode(val);
            l2 = l2.next;
            curr = curr.next;
        }
        if(overflow > 0){
            curr.next = new ListNode(overflow);
        }
        return root;
    }
}
