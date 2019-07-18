package collection;

import java.sql.SQLOutput;

public class MyArrayList {
    private Integer[] array;

    public MyArrayList() {
        this.array = new Integer[10];
    }

    public int get(int index) {

        return array[index];
    }

    public void add(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = value;
                break;
            }

            if (i == (array.length - 1)) {
                Integer[] resultArray = new Integer[2 * array.length];
                copyArray(array, resultArray);
                resultArray[array.length] = value;
                array = resultArray;
            }
        }

    }

    public int length() {

        return array.length;
    }

    private void copyArray(Integer[] arrayFrom, Integer[] arrayTo) {
        for (int i = 0; i < arrayFrom.length; i++) {
            arrayTo[i] = arrayFrom[i];
        }
    }

    public void remove(Integer index) {
        if (index >= 0 && index<array.length ) {
            for (int i = index; i < array.length; i++) {
                if (i < array.length - 1) {
                    array[i] = array[i + 1];
                } else {
                    array[array.length - 1] = null;
                }

            }

        } else {
            System.out.println("Некорректный ввод");
        }

    }

    public void printMayArrayList(){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" | ");

        }
        System.out.println();

    }

}
