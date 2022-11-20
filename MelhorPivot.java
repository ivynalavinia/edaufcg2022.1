import java.util.Scanner;

class MelhorPivot {

    private static int melhorPivot(int[] array, int i, int j) {

        int countI = 0;
        int countJ = 0;

        for (int value : array) {
            if (array[i] > value) {
                countI++;
            } else if (array[i] < value) {
                countI--;
            }

            if (array[j] > value) {
                countJ++;
            } else if (array[j] < value) {
                countJ--;
            }
        }

        if (countI == array.length / 2) {
            return i;
        }

        if (countJ == array.length / 2) {
            return j;
        }

        if (Math.abs(countI) <= Math.abs(countJ)) {
            return i;
        } else {
            return j;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = sc.nextLine().split(" ");
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i ++) {
            newArray[i] = Integer.parseInt(array[i]);
        }
        int firstPivot = sc.nextInt();
        int secondPivot = sc.nextInt();

        System.out.println(melhorPivot(newArray, firstPivot, secondPivot));
    }
}
