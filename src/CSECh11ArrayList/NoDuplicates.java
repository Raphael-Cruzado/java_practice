package CSECh11ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5, 3, 1, 2, 1, 3, 3));
        System.out.println(noDuplicates(arrayList));

    }
    public static ArrayList<Integer> noDuplicates(ArrayList<Integer> arrayList) {
        return arrayList.stream().distinct().collect(Collectors.toCollection(ArrayList::new));
    /*
        The ** distinct() ** method is called on the
        [ArrayList<Integer> arrayList] using the Stream API.
        It returns a stream of distinct elements,
         and then collect() is used to convert the stream back to an ArrayList.
    */
    }
}
