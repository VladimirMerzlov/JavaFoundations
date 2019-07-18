package collection;

import java.util.LinkedList;

public class CollectionRunner {
    public static void main(String[] args) {

        MyArrayList MyIntegerArrayList = new MyArrayList();
        MyIntegerArrayList.add(5);
        MyIntegerArrayList.add(6);
        MyIntegerArrayList.add(7);
        MyIntegerArrayList.add(6);
        MyIntegerArrayList.add(23);
        MyIntegerArrayList.add(11);
        System.out.println("Print ArrayList");
        MyIntegerArrayList.printMayArrayList();

//        for (int i = 0; i < MyIntegerArrayList.length(); i++) {
//            MyIntegerArrayList.add(i + 1);
//
//        }
//
        System.out.println("Method removeArrayList");
        MyIntegerArrayList.remove(11);
        MyIntegerArrayList.printMayArrayList();

//        for (int i = 0; i <MyIntegerArrayList.length() ; i++) {
//            System.out.print(MyIntegerArrayList.get(i)+" ");
//
//        }
//        System.out.println(MyIntegerArrayList.length());

        System.out.println("LinkedList");
        MyIntLinkedList myIntLinkedList = new MyIntLinkedList();
        MyIntNode head = new MyIntNode(1, new MyIntNode(5, new MyIntNode(9, new MyIntNode(-1, null))));
        myIntLinkedList.setHead(head);
        myIntLinkedList.print();

        
    }
}
