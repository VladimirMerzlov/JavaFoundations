package collection_test;

import java.util.ArrayList;
import java.util.List;

public class CollectionRunner {
    public static void main(String[] args) {
//        Pet zhorha = new Pet("Жора");
//        Pet ball = new Pet("Шарик");
//
//        List pets = new ArrayList();
//        pets.add(zhorha);
//        pets.add(ball);
//
//        System.out.println("Имя первого животного: " + ((Pet) pets.get(0)).getName());
//        pets.add("Andrey");
//        if (pets.get(2) instanceof Pet) {
//            System.out.println("Имя третьего животного: " + ((Pet) pets.get(2)).getName());
//        } else {
//            System.out.println("Не животное");
//        }
//        List<Pet> truePetsList = new ArrayList<>();
//        truePetsList.add(zhorha);
//        truePetsList.add(ball);
//        truePetsList.add(new Pet("Andrey"));
        MyArrayList theBestListEver = new MyArrayList();
        theBestListEver.add(5);
        theBestListEver.add(6);
        theBestListEver.add(7);

        for (int i = 0; i < theBestListEver.length(); i++) {
            theBestListEver.add(i + 1);

        }
        System.out.println("Print List");

        for (int i = 0; i <theBestListEver.length() ; i++) {
            System.out.print(theBestListEver.get(i)+" ");

        }
        System.out.println(theBestListEver.length());

        System.out.println("LinkedList");
        MyIntLinkedList myIntLinkedList=new MyIntLinkedList();
        MyIntNode head = new MyIntNode(1,new MyIntNode(5,new MyIntNode(9,new MyIntNode(-1,null))));
        myIntLinkedList.setHead(head);
        myIntLinkedList.print();

    }
}
