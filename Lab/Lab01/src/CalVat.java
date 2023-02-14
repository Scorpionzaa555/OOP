import java.util.Scanner;
public class CalVat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money;
        money = sc.nextDouble();
        money *= 1.07;
        System.out.println(money);
    }
}
