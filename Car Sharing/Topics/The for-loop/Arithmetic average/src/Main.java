import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        double avg;
        double total = 0;
        int count = 0;

        for (int i = number1; i <= number2; i++) {
            if (i % 3 == 0) {
                total += i;
                count++;
            }
        }
        avg = total / count;
        System.out.println(avg);
    }
}