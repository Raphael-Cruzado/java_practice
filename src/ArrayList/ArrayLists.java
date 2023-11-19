package ArrayList;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        ArrayList<Integer> newList = getInRange(myArray, 100, 1000);
        System.out.println(newList);
    }

    public static ArrayList<Integer> getInRange(int[] myArray, int num1, int num2) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        for (int i = 0; i < myArray.length; ++i) {
            if (myArray[i] > num1 && myArray[i] < num2) {
                dynamicArray.add(myArray[i]);
            }
        }

        return dynamicArray;
    }
}
