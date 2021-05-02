import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int squareNum = 1;
        int iterator = 1;

        while (true) {
            squareNum = iterator * iterator;
            if (squareNum <= number) {
                System.out.println(squareNum);
                iterator++;
            } else {
                break;
            }
        }
    }
}