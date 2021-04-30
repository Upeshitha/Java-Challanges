import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height1 = scanner.nextInt();
        int height2 = scanner.nextInt();
        int height3 = scanner.nextInt();

        /*
        // this way low performance
        boolean descOrder = (height1 >= height2) && (height2 >= height3);
        boolean asceOrder = (height3 >= height2) && (height2 >= height1);
        boolean print = false;

        if (descOrder || asceOrder){
            print = true;
        }

        System.out.println(print); */

        boolean result = height1 <= height2 && height2 <= height3 || height1 >= height2  && height2 >= height3;
        System.out.println(result);

    }
}