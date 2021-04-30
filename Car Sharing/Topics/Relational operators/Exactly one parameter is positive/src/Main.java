import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        boolean b1 = num1 > 0 && num2 <= 0 && num3 <= 0;
        boolean b2 = num2 > 0 && num1 <= 0 && num3 <= 0;
        boolean b3 = num3 > 0 && num1 <= 0 && num2 <= 0;

        System.out.println(b1 || b2 || b3);
        
        scanner.close();
    }
}
