import java.util.Arrays;
import java.util.Scanner;

class InsereUltimo {

    static void insereUltimo(int[] array){

        for (int i = array.length-1; i > 0; i--) {
            int j = i - 1;
            if (array[i] < array[j]) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
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
        insereUltimo(newArray);
        System.out.println(Arrays.toString(newArray));
    }

}
