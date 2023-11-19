package Lab08Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysGet {
    public static void main(String[] args) {
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        System.out.println("First value: " + getFirst(myArray));
        System.out.println("Last value: " + getLast(myArray));
        System.out.println(contains(myArray, 123));
        System.out.println("All values except the first: " + Arrays.toString(getAllButFirst(myArray)));
        System.out.println(Arrays.toString(getAllGreaterThan(myArray, 0)));

    }


    public static int getFirst(int[] myArray) {
        return myArray[0];
    }
    public static int getLast(int[] myArray) {
        return myArray[myArray.length - 1];
    }

    public static boolean contains(int[] myArray, int num) {
        System.out.printf("is %d in the list? ", num);
        boolean isTrue = true;
        for (int i = 0; i < myArray.length; ++i) {
            if (myArray[i] == num) {
                isTrue = true;
                break;
            } else {
                isTrue = false;
            }
        }
        return isTrue;
    }

    public static int[] getAllButFirst(int[] myArray) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        int firstValue = getFirst(myArray);

        for (int i = 0; i < myArray.length; ++i) {
            if (myArray[i] != firstValue) {
               dynamicArray.add(myArray[i]);
            }
        }

        int[] newArray = new int[dynamicArray.size()];
        // [0, 0]
        for (int i = 0; i < dynamicArray.size(); ++i) {
            newArray[i] = dynamicArray.get(i);
        }

        return newArray;
    }

    public static int[] getAllGreaterThan (int[] myArray, int num) {
        System.out.println();
        System.out.println("Values that are greater than " + num + ": ");
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        for (int i = 0; i < myArray.length; ++i) {
            if (myArray[i] > num) {
                dynamicArray.add(myArray[i]);
            }
        }

        int[] newArray = new int[dynamicArray.size()];
        for (int i = 0; i < dynamicArray.size(); ++i) {
            newArray[i] = dynamicArray.get(i);
        }

        return newArray;
    }

}
