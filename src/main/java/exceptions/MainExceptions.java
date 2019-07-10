package exceptions;

import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args) {
        try {
            MyFailed myFailed1 = new MyFailed("Chuck Norris");
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя самого крутого из крутых ");
            String temp = sc.nextLine();
            MyFailed myFailed = new MyFailed(temp);

//            int a = 5;
//            int b = 3;
//            System.out.println(5 / 3);
//            System.out.println(5 / 0);
            myFailed.bestOfTheBest();
            myFailed1.bestOfTheBest();
            System.out.println(myFailed.getName());
            System.out.println(myFailed1.getName());
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());

        } catch (MyException myE) {
            System.out.println("BestOfTheBestException! - нет никого круче Чака Норисса");
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя самого крутого из крутых ");
            String temp = sc.nextLine();
            MyFailed myFailed = new MyFailed(temp);
        } finally {
            System.out.println("Это был трудный выбор");
        }
    }
}
