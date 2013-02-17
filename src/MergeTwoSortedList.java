
public class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(l1 == null)
        	return l2;
        if(l2 == null)
        	return l1;
        ListNode head;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode last;
        if(curr1.val < curr2.val){
        	head = curr1;
        	last = curr1;
        	curr1 = curr1.next;
        }
        else{
        	head = curr2;
        	last = curr2;
        	curr2 = curr2.next;
        }
        while(true){
        	if(curr1 == null){
        		last.next = curr2;
        		break;
        	}
        	if(curr2 == null){
        		last.next = curr1;
        		break;
        	}
        	if(curr1.val < curr2.val){
        		last.next = curr1;
        		curr1 = curr1.next;
        		last = last.next;
        	}
        	else{
        		last.next = curr2;
        		curr2 = curr2.next;
        		last = last.next;
        	}
        }
        return head;
    }
}
