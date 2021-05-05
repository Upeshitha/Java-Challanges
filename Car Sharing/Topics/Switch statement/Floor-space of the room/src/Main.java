import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        double length1;
        double length2;
        double length3;
        double radius;
        double area = 0;
        double pi = 3.14;

        switch (userInput) {
            case "triangle":
                length1 = input.nextDouble();
                length2 = input.nextDouble();
                length3 = input.nextDouble();

                // Use Heron's formula to calculate the area of a triangle when only sides of the triangle are givin
                double halfParamiter = (length1 + length2 + length3) / 2;
                area = Math.sqrt(halfParamiter * (halfParamiter - length1) *
                        (halfParamiter - length2) * (halfParamiter - length3));
                break;
            case "circle":
                radius = input.nextDouble();
                area = pi * radius * radius;
                break;
            case "rectangle":
                length1 = input.nextDouble();
                length2 = input.nextDouble();
                area = length1 * length2;
                break;
            default:
                System.out.println("Invalid Input, please enter valid input!");
                break;
        }

        System.out.println(area);
        input.close();
    }
}