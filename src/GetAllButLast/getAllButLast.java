package GetAllButLast;

import java.util.Arrays;

public class getAllButLast {
    public static void main(String[] args) {
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        int[] newArray = getAllButLast(myArray);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] getAllButLast(int[] myArray) {

        // Create a new array with size one less than the original array
        int[] newArray = new int[myArray.length - 1];

        // Copy elements from the original array to the new array
        System.arraycopy(myArray, 0, newArray, 0, myArray.length - 1);

        return newArray;
    }
}
