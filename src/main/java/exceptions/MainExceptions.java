package exceptions;

import java.util.Scanner;

public class MainExceptions {
    public static void main(String[] args) {

        try {
            MyFailed myFailed1 = new MyFailed("Chuck Norris");
            name();
            MyFailed myFailed = new MyFailed("q");
            myFailed.bestOfTheBest();
            myFailed1.bestOfTheBest();
            System.out.println(myFailed.getName());
            System.out.println(myFailed1.getName());
        } catch (MyException myE) {
            System.out.println("BestOfTheBestException! - нет никого круче Чака Норисса");
            name();
        } finally {
            System.out.println("Это был трудный выбор");
        }
    }

    public static Object name() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя самого крутого из крутых ");
        String temp = sc.nextLine();
        MyFailed myFailed = new MyFailed(temp);
        return myFailed;
    }
}
