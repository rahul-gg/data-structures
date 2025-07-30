package Algo;

public class LL {
    public Node head;
    public Node tail;
    public int size;

    public LL() {
        this.size = 0;
    }

    public class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void display(String s) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + s);
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int val) {
        Node node = new Node(val, head);
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtIndex(int index, int value) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;
    }

    public void deleteLast() {
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteIndex(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void reverse() {
        Node prev=null;
        while(head.next!=null){
            Node temp = head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        head.next=prev;
    }

}
