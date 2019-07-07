package collection_test;

public class MyArrayList {
    private int[] array;

    public MyArrayList() {
        this.array = new int[10];
    }

    public int get(int index) {
        return array[index];
    }

    public void add(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = value;
                break;
            }

            if (i == (array.length - 1)) {
                int[] resultArray = new int[2 * array.length];
                copyArray(array, resultArray);
                resultArray[array.length] = value;
                array = resultArray;
            }
        }

    }

    public int length() {
        return array.length;
    }

    private void copyArray(int[] arrayFrom, int[] arrayTo) {
        for (int i = 0; i < arrayFrom.length; i++) {
            arrayTo[i] = arrayFrom[i];
        }
    }

}
