import java.util.Arrays;
import java.util.Scanner;

class SelectionSortRecursivo {

    static int[] selectionSort(int[] array, int i) {

        if (i == array.length - 1) {
            return array;
        }

        int lowerIndex = i;
        for (int j = i + 1; j < array.length; j++) {
            if(array[j] < array[lowerIndex]) {
                lowerIndex = j;
            }
        }

        int aux = array[i];
        array[i] = array[lowerIndex];
        array[lowerIndex] = aux;

        System.out.println(Arrays.toString(array));

        return selectionSort(array, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }
        selectionSort(newArray, 0);
    }

}
