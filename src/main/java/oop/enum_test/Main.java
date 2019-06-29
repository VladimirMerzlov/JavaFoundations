package oop.enum_test;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enterLine = scanner.nextLine();
        Good goodFromEnter = Good.valueOf(enterLine);
//        System.out.println(goodFromEnter.toString());
        Good[] goodsArray = Good.values();
        for (int i = 0; i < goodsArray.length; i++) {
//            if (goodFromEnter.compareTo(goodsArray[i])==0) {
//                System.out.println("Мы нашли товар "+goodsArray[i]);
//            }
            if (enterLine.equals(goodsArray[i].name())) {
                System.out.println("Мы нашли товар " + goodsArray[i]);
            }
        }
        scanner.close();

    }
}