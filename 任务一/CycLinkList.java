public class CycLinkList {
    private  class  Node{
        public  int val;
        public Node next;
        public Node(int i) {
            val = i;
            next = null;
        }
    }
    //public Node root;
    public Node head;
    public  Node tail;
    private int size;

    public CycLinkList(){
    }

    public void add(int i){
       if (tail==null){
           tail = new Node(i);
           tail.next = tail;
       }
       else{
           Node tampHead = tail.next;
           tail.next = new Node(i);
           tail = tail.next;
           tail.next = tampHead;
       }
    }

    public boolean remove(int i){
        if (tail==null) return false;
        Node cur = tail.next;
        do{
            if (cur.val==i)return true;
            cur = cur.next;
        }while (cur!=tail.next);
        return false;
    }
}
