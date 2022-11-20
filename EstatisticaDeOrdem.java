import java.util.Scanner;

class EstatisticaDeOrdem {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int centerPivot(int[] array) {
        int pivot = array[0];
        int i = 0;

        for (int j = 1; j <= array.length - 1; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, 0, i);
        return i;
    }

    private static int orderStatistics(int[] array, int pivot) {
        int i = 0;
        int cont = 0;
        while (array[i] <= pivot) {
            cont++;
            i++;
        }
        return cont + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }
        int indexPivot = centerPivot(newArray);
        int order = orderStatistics(newArray, indexPivot);
        System.out.println(order);
    }

}
