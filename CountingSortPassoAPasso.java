import java.util.Arrays;
import java.util.Scanner;

class CountingSortPassoAPasso {

    private static StringBuilder buildString(int[] array){
        StringBuilder arrString = new StringBuilder();
        for (int num : array) {
            arrString.append(num).append(" ");
        }
        return arrString;
    }

    public static void countingSort(int[] array, int k) {

        int leftIndex = 0;
        int rightIndex = array.length - 1;

        int[] frequency = new int[k + 1];

        for (int i = leftIndex; i <= rightIndex; i++) {
            frequency[array[i]] += 1;
            System.out.println(buildString(frequency).toString().trim());
        }

        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];
        }

        System.out.println("Cumulativa do vetor de contagem - " + buildString(frequency).toString().trim());

        int[] newArray = new int[array.length];

        for (int i = rightIndex; i >= leftIndex; i--) {
            newArray[frequency[array[i]] - 1] = array[i];
            frequency[array[i]] -= 1;
        }

        System.out.println(buildString(frequency).toString().trim());
        System.out.println(buildString(newArray).toString().trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];
        int k = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }
        countingSort(newArray, k);
    }

}
