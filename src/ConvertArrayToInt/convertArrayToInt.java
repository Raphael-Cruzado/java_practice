package ConvertArrayToInt;

import java.util.ArrayList;
import java.util.Arrays;

public class convertArrayToInt {
    public static void main(String[] args) {
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        int[] newList = getInRange(myArray, 100, 1000);
        System.out.println(Arrays.toString(newList));
    }

    public static int[] getInRange(int[] myArray, int num1, int num2) {
        // creates an empty array OBJECT
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        for (int i = 0; i < myArray.length; ++i) {
            if (myArray[i] > num1 && myArray[i] < num2) {
                dynamicArray.add(myArray[i]);
            }
        }

        // this converts dynamic array(and array data class) to int[] data class
        int[] resultArray = new int[dynamicArray.size()];
        // turns into [0,0] an empty int[], the size() just initializes it
        System.out.println(Arrays.toString(resultArray));

        // stores the values dynamic Array into each index of resultArray
        for (int i = 0; i < dynamicArray.size(); i++) {
            resultArray[i] = dynamicArray.get(i);
        }

        return resultArray;
    }
}
