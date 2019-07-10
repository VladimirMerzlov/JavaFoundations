package exceptions;

import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args) {
       MyFailed myFailed = new MyFailed("Terminator");
       MyFailed myFailed1 = new MyFailed("Chuck Norris");
        try {
            int a = 5;
            int b = 3;
            System.out.println(5 / 3);
            System.out.println(5 / 0);
            myFailed.bestOfTheBest();
            myFailed1.bestOfTheBest();
            System.out.println(myFailed.getName());
            System.out.println(myFailed1.getName());
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());

        } catch (MyException myE) {
            System.out.println("BestOfTheBestException");
        } finally {
            System.out.println("Это блок finally! Он выводится в любом случае");
        }
    }
}
