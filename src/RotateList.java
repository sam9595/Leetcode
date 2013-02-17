
public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	ListNode front = head;
    	ListNode end = head;
    	if(n==0 || head == null)
    		return head;
    	while(n > 0){
    		if(end == null)
    			end = head;
    		end = end.next;
    		n--;
    	}
    	if(end == null){	//exact n elements
    		return head;
    	}
    	while(true){
    		if(end.next == null){
    			end.next = head;
    			ListNode newHead = front.next;
    			front.next = null;
    			return newHead;
    		}
    		if(front == end){	//ring linkted list, never end
    			return null;
    		}
    		front = front.next;
    		end = end.next;
    	}
    }
    public static void main(String args[]){
    	ListNode head = new ListNode(1);
    	ListNode curr = head;
    	for(int i = 2 ; i < 6 ; i++){
    		curr.next = new ListNode(i);
    		curr = curr.next;
    	}
    	RotateList r = new RotateList();
    	head = r.rotateRight(head,5);
    	while(head!=null){
    		System.out.println(head.val);
    		head = head.next;
    	}
    }
}
