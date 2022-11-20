import java.util.Scanner;

class VetorCircular {

    public static String vetorCircular(int[] array, int quantidadeElementos) {
        StringBuilder out = new StringBuilder();
        for (int j = 0; j < quantidadeElementos; j++) {
            out.append(array[(j % array.length)]).append(" ");
        }

        return out.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];
        int repeat = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }

        System.out.println(vetorCircular(newArray, repeat));
    }
}
