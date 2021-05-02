import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        double persantage = scanner.nextDouble();
        double reachMoney = scanner.nextDouble();
        int year = 0;

        while (reachMoney > money) {
            money += money * (persantage / 100);
            year += 1;
        }

        System.out.println(year);

    }
}