import java.util.LinkedList;

public class MyLinkedList {
    private  class  Node{
        public  int val;
        public Node next;
        public Node(int i) {
            val = i;
            next = null;}
    }
    public Node root;
    public Node head;
    public  Node tail;
    private int size;
    public MyLinkedList(int i){

        root = new Node(0);
        head = new Node(i);
        root.next = head;
        tail = head;
        size = 1;
    }
    public MyLinkedList(){
        root = new Node(0);
        head = root.next;
        tail = head;
    }
    public void add(int i){

        if (head!=null){
            tail.next = new Node(i);
            tail = tail.next;
        }
        else {
            head = new Node(i);
        }
        size++;
        //return true;
    }
    public boolean remove(int i){
        //Node cur = head;
        for (Node cur = head,pre = root;cur != null;
             cur = cur.next, pre = pre.next){
          if (cur.val==i){
              pre.next = cur.next;
              size--;
              return true;
          }
        }
        return false;
    }



}
