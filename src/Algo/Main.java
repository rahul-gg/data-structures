package Algo;

//import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();

//        LinkedList<Integer> newList = new LinkedList<Integer>();
//        newList.add(1);
//        newList.add(2);
//        newList.add(3);
//        System.out.println(newList);

        list.insertFirst(18);
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertAtIndex(3, 7);
//        list.deleteLast();
//        list.display();
//        list.deleteIndex(3);
        list.display();
        list.reverse();
        list.display();
    }
}
