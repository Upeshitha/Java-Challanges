import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();


        for (int x = 0; x < 1000; x++) {
            int equation = (a * (x * x * x)) + (b * (x * x)) + (c * x) + d;
            int count = 0;

            if (equation == 0) {
                System.out.println(x);
                count ++;
            }
            if (count == 3) break;
        }
    }
}