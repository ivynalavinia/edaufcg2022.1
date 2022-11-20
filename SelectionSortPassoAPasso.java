import java.util.Arrays;
import java.util.Scanner;

class SelectionSortPassoAPasso {

    static void selectionSort(int[] array){

        for (int i = 0; i < array.length; i++) {

            int lowerIndex = i;
            boolean sorted = true;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowerIndex]) {
                    sorted = false;
                    lowerIndex = j;
                }
            }

            int aux = array[i];
            array[i] = array[lowerIndex];
            array[lowerIndex] = aux;

            if (!sorted) {
                System.out.println(Arrays.toString(array));
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
        selectionSort(newArray);
    }

}
