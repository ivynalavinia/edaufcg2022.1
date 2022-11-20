import java.util.Arrays;
import java.util.Scanner;

class MarianaEOsLivros {

    static void insertionSort(String[] array) {

        for (int i = 0; i < array.length; i++) {
            int j = i;

            while (j > 0 && array[j].compareTo(array[j - 1]) < 0){
                String aux = array[j];
                array[j] = array[j - 1];
                array[j - 1] = aux;
                j--;
            }

            StringBuilder out = new StringBuilder();
            for (String s : array) {
                out.append(s).append(", ");
            }

            System.out.println(out.substring(0, out.length() - 2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(",");
        insertionSort(array);
    }

}
