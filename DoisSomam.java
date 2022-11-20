import java.util.Arrays;
import java.util.Scanner;

class DoisSomam {

    public static int[] two_sum(int[] v, int target) {
        int[] aux = new int[2];
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if ((v[i] + v[j]) == target) {
                    aux[0] = v[i];
                    aux[1] = v[j];
                    break;
                }
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];
        int target = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }

        int[] result = two_sum(newArray, target);
        if (result[0] == 0 && result[1] == 0 && target != 0) {
            System.out.println(-1);
        } else {
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
