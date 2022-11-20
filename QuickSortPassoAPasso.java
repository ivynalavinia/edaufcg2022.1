import java.util.Arrays;
import java.util.Scanner;

class QuickSortPassoAPasso {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partition(int[] array, int leftIndex, int rightIndex) {

        int pivot = array[leftIndex];
        int i = leftIndex;

        for (int j = leftIndex + 1; j <= rightIndex; j++) {

            if (array[j] <= pivot) {
                i += 1;
                swap(array, i, j);
            }
        }
        swap(array, leftIndex, i);

        StringBuilder out = new StringBuilder();
        for (int number : array) {
            out.append(number).append(" ");
        }
        System.out.println(out.toString().trim());

        return i;
    }

    public static void quickSort(int[] array, int leftIndex, int rightIndex) {

        if (leftIndex < rightIndex) {
            int indexPivot = partition(array, leftIndex, rightIndex);
            quickSort(array, leftIndex, indexPivot - 1);
            quickSort(array, indexPivot + 1, rightIndex);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }
        quickSort(newArray, 0, newArray.length - 1);
    }

}
