import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (total >= 1000) {
                total -= 1000;
                continue;
            }

            total += num;

        }

        System.out.println(total);
    }
}