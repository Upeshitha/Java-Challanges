import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number % 2 == 0 && number != 0) {
                System.out.println("even");
            } else if (number == 0) {
                break;
            } else {
                System.out.println("odd");
            }
        }
        */

        // this way better
        int input;
        while ((input = scanner.nextInt()) != 0) {
            System.out.println(input % 2 == 0 ? "even" : "odd");
        }
    }
}