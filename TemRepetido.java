import java.util.Scanner;

class TemRepetido {

    public static boolean tem_repetido(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }

        System.out.println(tem_repetido(newArray));
    }
}
