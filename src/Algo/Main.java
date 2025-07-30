package Algo;

//import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(18);
        list.insertFirst(19);
        list.insertFirst(20);
        list.insertFirst(21);
//        list.display(" -> ");
//        list.insertAtIndex(3, 7);
//        list.deleteLast();
//        list.display();
//        list.deleteIndex(3);
//        list.reverse();
//        list.display(" -> ");

        DoubleLL doubleLL = new DoubleLL();
        doubleLL.addFirst(1);
//        System.out.println(doubleLL.head.next.val);
        doubleLL.addFirst(2);
        doubleLL.addFirst(3);
        doubleLL.display(" <=> ");
    }
}
