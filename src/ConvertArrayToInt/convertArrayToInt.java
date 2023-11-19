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
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        for (int i = 0; i < myArray.length; ++i) {
            if (myArray[i] > num1 && myArray[i] < num2) {
                dynamicArray.add(myArray[i]);
            }
        }

        int[] resultArray = new int[dynamicArray.size()];
        for (int i = 0; i < dynamicArray.size(); i++) {
            resultArray[i] = dynamicArray.get(i);
        }

        return resultArray;
    }
}
