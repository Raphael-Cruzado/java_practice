package CSECh11ArrayList;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 22, 333, 400, 5005, 9));
        printArrayList(arrayList, ", ");
    }
    public static void printArrayList(ArrayList<Integer> arrayList, String punc) {
        for (int i = 0; i < arrayList.size(); ++i) {
            System.out.printf((i == arrayList.size() - 1) ? "%d%n" : "%d%s", arrayList.get(i), punc);
        }
    }
}
