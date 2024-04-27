import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };

        MainProgram.sort(numbers);

    }

    public static int smallest(int[] array) {
        int smallest = array.length;

        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = MainProgram.smallest(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                return i;
            }
        }

        return 404;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int smallestArray = MainProgram.indexOfSmallestFrom(array, i);

            MainProgram.swap(array, i, smallestArray);

            System.out.println(Arrays.toString(array));
        }
    }

}
