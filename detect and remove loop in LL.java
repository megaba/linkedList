
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public ListNode detectCycle(ListNode head) {

        
        ListNode sp = head;
        ListNode fp = head;
        while (fp!=null && fp.next!=null) {
        
            sp = sp.next;
            fp = fp.next.next;
            if(sp==fp) {
                sp = head;
                ListNode prev = fp;

                while(sp!=fp) {
                sp = sp.next;
                prev=fp;
                fp = fp.next;
            }
            
                 prev.next = null;
            
        }

        }
    ListNode temp = head;
    while(temp!=null) {
        System.out.println(temp.val);
        temp =temp.next; }
    
   return null;
        
    }
}