package CSECh11ArrayList;

import java.util.ArrayList;
import java.util.List;
public class GetAllOdds {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(3, 2, 7, 5, 8, 6));
        System.out.println(getAllOdd(arrayList));

    }
    public static ArrayList<Integer> getAllOdd(ArrayList<Integer> arrayList) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); ++i) {
            if (arrayList.get(i) % 2 != 0) {
                newArray.add(arrayList.get(i));
            }
        }
        return newArray;
    }
}
