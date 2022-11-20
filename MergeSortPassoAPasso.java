import java.util.Arrays;
import java.util.Scanner;

class MergeSortPassoAPasso {
    private static void merge(int[] array, int leftIndex, int rightIndex) {
        int[] helper = new int[array.length];

        for (int i = leftIndex ; i < rightIndex + 1; i++) {
            helper[i] = array[i];
        }

        int i = leftIndex;
        int middle = (leftIndex + rightIndex) / 2;
        int j = middle + 1;
        int k = leftIndex;

        while (i <= middle && j <= rightIndex) {
            if (helper[i] <= (helper[j])) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k++] = helper[i++];
        }
        while (j <= rightIndex) {
            array[k++] = helper[j++];
        }
    }

    static void mergeSort(int[] array, int leftIndex, int rightIndex) {

        System.out.println(Arrays.toString(Arrays.copyOfRange(array, leftIndex, rightIndex + 1)));

        if (leftIndex < rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, middle);
            mergeSort(array, middle + 1, rightIndex);
            merge(array, leftIndex, rightIndex);

            if (rightIndex - leftIndex < array.length-1) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(array, leftIndex, rightIndex + 1)));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }
        mergeSort(newArray, 0, newArray.length - 1);
        System.out.println(Arrays.toString(newArray));
    }

}
