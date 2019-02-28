public class DulLinkedList {
    private int size;
    private Node first;
    private Node last;
    private static class Node {
        int item;
        Node next;
        Node prev;

        Node(Node prev, int element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public DulLinkedList(){
        size = 0;
    }

    public DulLinkedList(int[] list){
        size = 0;
        int numNew = list.length;
        Node pred;//
     //   succ = null;
        pred = null;
        for (int num : list) {
            Node newNode = new Node(pred, num, null);
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }
        last = pred;
        size += numNew;
    }


    public void add(int i){
        if (first==null){
            first = new Node(null, i, null);
            last = first;
        }
        else {
            last.next = new Node(last, i, null);
            last = last.next;
        }
        size++;
    }

    public boolean remove(int i){
        for (Node x = first; x != null; x = x.next) {
            if (x.item == i) {
                int element = x.item;
                Node next = x.next;
                Node prev = x.prev;

                if (prev == null) {
                    first = next;
                } else {
                    prev.next = next;
                    x.prev = null;
                }

                if (next == null) {
                    last = prev;
                } else {
                    next.prev = prev;
                    x.next = null;
                }
                size--;
                return true;
            }
        }
        return false;
    }



}
