import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int fac = 1;
        int num = 2;

       do {
           fac = fac * (num);
           num++;
       } while (fac < number);

        System.out.println(num);
        scanner.close();
    }
}