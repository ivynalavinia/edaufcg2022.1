import java.util.Arrays;
import java.util.Scanner;

class InsertionSortRecursivo {

    static int[] insertionSortRecursivo(int[] array, int i) {

        int j = i;

        if (i == array.length) {
            return array;
        }

        while (j > 0 && array[j] < array[j - 1]) {
            int aux = array[j];
            array[j] = array[j - 1];
            array[j - 1] = aux;
            j--;
        }

        System.out.println(Arrays.toString(array));
        return insertionSortRecursivo(array, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }
        insertionSortRecursivo(newArray, 1);
    }

}
