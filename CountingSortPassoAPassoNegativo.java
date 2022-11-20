import java.util.Arrays;
import java.util.Scanner;

class CountingSortPassoAPassoNegativo {

    public static void countingSort(int[] array, int k, int lower) {

        int leftIndex = 0;
        int rightIndex = array.length - 1;

        int[] frequency = new int[k - lower + 1];

        for (int i = leftIndex; i <= rightIndex; i++) {
            frequency[array[i] - lower] += 1;
            System.out.println(Arrays.toString(frequency));
        }

        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];
        }

        System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(frequency));

        int[] newArray = new int[rightIndex - leftIndex + 1];

        for (int i = rightIndex; i >= leftIndex; i--) {
            newArray[frequency[array[i] - lower] - 1] = array[i];
            frequency[array[i] - lower] -= 1;
        }

        System.out.println(Arrays.toString(frequency));
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];
        int k = Integer.parseInt(sc.nextLine());
        int lower = sc.nextInt();

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }
        countingSort(newArray, k, lower);
    }

}
