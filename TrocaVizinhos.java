import java.util.Arrays;
import java.util.Scanner;

class TrocaVizinhos {

    public static void troca_vizinhos(int[] v) {
        int aux;
        for (int i = 0, j = 1; j < v.length; i += 2, j += 2) {
            aux = v[i];
            v[i] = v[j];
            v[j] = aux;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }

        troca_vizinhos(newArray);

        System.out.println(Arrays.toString(newArray));
    }

}
