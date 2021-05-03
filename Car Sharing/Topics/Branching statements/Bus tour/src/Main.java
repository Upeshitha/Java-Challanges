import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int numOfBridges = scanner.nextInt();
        boolean busCrash = false;
        int crashBridge = 0;

        for (int i = 0; i < numOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();

            if (!busCrash) {
                crashBridge += 1;
            } else {
                continue;
            }

            if (bridgeHeight <= busHeight) {
                busCrash = true;
            }
        }

        if (!busCrash) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + crashBridge);
        }
    }
}