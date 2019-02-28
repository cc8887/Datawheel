package TreeNode;

public class Test141 {
	public static void main(String[] args) {
		ListNode a1 = new ListNode(2);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(2);
		ListNode a4 = new ListNode(2);
		
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		//a4.next = a2;
		System.out.println(hasCycle(a1));
	}
	  static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
	  }
    public static boolean hasCycle(ListNode head) {
    	if (head==null) return false;
         ListNode slowIndex = head, fastIndex = slowIndex.next;
         while (fastIndex!=null) {
			if (fastIndex==slowIndex||fastIndex.next==slowIndex) return true;
			if (fastIndex.next!=null) {
				fastIndex = fastIndex.next;
			}
			fastIndex = fastIndex.next;
			slowIndex = slowIndex.next;
		}
         return false;
    }
}
