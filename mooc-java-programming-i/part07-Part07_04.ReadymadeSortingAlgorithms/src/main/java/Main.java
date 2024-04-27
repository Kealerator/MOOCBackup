import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
        String[] array2 = { "Daavid", "Eeva", "Aatami", "Gideon", "Bertta" };

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        System.out.println(Arrays.toString(array));

        sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(array2));
        sort(array2);
        System.out.println(Arrays.toString(array2));

        list.add(8);
        list.add(5);
        list.add(3);
        list.add(9);

        System.out.println(list);
        sortIntegers(list);
        System.out.println(list);

        list2.add("Gideon");
        list2.add("Daavid");
        list2.add("Aatami");
        list2.add("Eeva");

        System.out.println(list2);
        sortStrings(list2);
        System.out.println(list2);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
    }

    public static void sortStrings(ArrayList<String> arrayList) {
        Collections.sort(arrayList);
    }

}
