import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        // this way get more lines
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];

        // get the numbers from the user
        for (int i = 0; i < 4; i++) {
            arr1[i] = scanner.nextInt();
        }

        //Decrement by 1
        for (int i = 0; i < 4; i++) {
            arr2[i] = arr1[i] - 1;
        }

        //print the derement one
        for (int i:arr2) {
            System.out.print(i + " ");
        }
        */

        // simple step
        for (int i = 0; i < 4; i++) {
            System.out.print((scanner.nextInt() - 1) + " ");
        }

    }
}