/*
check this link also:
https://stackoverflow.com/questions/62029063/ordered-or-unordered-sequence-problem-in-java
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        boolean asc = true;
        boolean dsc = true;
        number1 = scanner.nextInt();

        while (number1 == 0) {
            number1 = scanner.nextInt();
        }

        while (true) {
            number2 = scanner.nextInt();
            if (number2 == 0) {
                break;
            }

            dsc = dsc && number1 >= number2;
            asc = asc && number1 <= number2;
            if (!asc && !dsc) {
                break;
            }
            number1 = number2;
        }
        System.out.println(asc || dsc);
    }

    /*
    import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ascending = true;
        boolean descending = true;
        int prevNumber = sc.nextInt();
        int lastNumber;
        while ((lastNumber = sc.nextInt()) != 0) {
            if (lastNumber > prevNumber) {
                descending = false;
            } else if (lastNumber < prevNumber) {
                ascending = false;
            }
            prevNumber = lastNumber;
        }
        System.out.println(ascending || descending);
    }
}
     */
}