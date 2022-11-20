import java.util.Scanner;

class EhPrimo {

    public static boolean eh_primo(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        System.out.println(eh_primo(number));
    }
}
