import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choiceNumber = scanner.nextInt();
        String message;

        switch (choiceNumber) {
            case 1:
                message = "Yes!";
                break;
            case 2:
            case 3:
            case 4:
                message = "No!";
                break;
            default:
                message = "Unknown number";
                break;
        }

        System.out.println(message);
        scanner.close();
    }
}