import java.util.Scanner;

class WarmUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multiplier = Integer.parseInt(sc.nextLine());
        String[] numbers = sc.nextLine().split(" ");
        StringBuilder out = new StringBuilder();

        for (String number : numbers) {
            out.append(Integer.parseInt(number) * multiplier).append(" ");
        }
        System.out.println(out.toString().trim());
    }
}
