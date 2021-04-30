import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check = false;
        
        if (number < 10) {
            check = true;
        }
        
        System.out.print(check);
    }
}
