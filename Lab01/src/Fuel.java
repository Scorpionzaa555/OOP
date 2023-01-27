import java.util.Scanner;
public class Fuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fuel, money;
        fuel = sc.nextDouble();
        money = fuel*30;
        System.out.println(money);
    }
}
