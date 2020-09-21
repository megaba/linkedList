
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public boolean hasCycle(ListNode head) {

    boolean ifCycle = false;
    ListNode sp = head;
    ListNode fp = head;
    ListNode temp = head;
    while(fp!=null && fp.next!=null) {
        sp = sp.next;
        fp = fp.next.next;
        if(sp==fp)
            return true;
    }
        
        return false;

    
        
    }
}