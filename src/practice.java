import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        int[] newList = getAllLessThan(myArray, 300);
        System.out.println(Arrays.toString(newList));
    }

    public static int[] getAllLessThan(int[] myArray, int num) {

        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // this adds to the empty array object list
        for (int i = 0; i < myArray.length; ++i) {
            if (myArray[i] < num) {
                dynamicArray.add(myArray[i]);
            }
        }

        // initialize an int[]
        int[] resultArray = new int[dynamicArray.size()];

        // now convert the collected values ane store in new int[]
        for (int i = 0; i < dynamicArray.size(); ++i) {
            resultArray[i] = dynamicArray.get(i);
        }

        return resultArray;
    }
}
