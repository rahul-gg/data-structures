package Algo;

public class DoubleLL extends LL {

    public DoubleLL() {
        super();
    }

    public void addFirst(int val) {
        Node node;
        if (size == 0) {
            node = new Node(val, null, null);
        } else {
            node = new Node(val, (Node) head, null);
        }
        head = node;
        size++;
    }

    public void display(String s) {
        System.out.print("START"+s);
        super.display(s);
    }


    public class Node extends LL.Node {
        public Node prev;
        public Node(int val, Node next, Node prev) {
            super(val, next);
            this.prev = prev;
        }

    }

}
