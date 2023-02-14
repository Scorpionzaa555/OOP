import java.util.Scanner;
public class BuyCom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert your monitor size 38 or 43 only");
        int size = sc.nextInt();
        System.out.println("Do you want DVD-ROM? 1 is Yes/ 0 is No");
        int bool_1 = sc.nextInt();
        System.out.println("Do you want printer? 1 is Yes/ 0 is No");
        int bool_2 = sc.nextInt();
        double computer = 375.99, moni43 = 99.99, moni38 = 75.99, dvd = 65.99, printer = 125.00, total = 0;
        
        System.out.println("======= Your order =======");
        System.out.println("*computer >>> " + computer + "$");
        if (size == 38){
            System.out.println("*38'Monitor >>> " + moni38 + "$");
            total = computer + moni38;
            if (bool_1 == 1){
                System.out.println("*DVD-Rom >>> " + dvd + "$");
                total += dvd;
            }
            if (bool_2 == 1){
                System.out.println("*printer >>> " + printer + "$");
                total += printer;
            }
            System.out.println("======= Total price >>> " + total + " =======");
        } else{
            System.out.println("*43'Monitor >>> " + moni43 + "$");
            total = computer + moni43;
            if (bool_1 == 1){
                System.out.println("*DVD-Rom >>> " + dvd + "$");
                total += dvd;
            }
            if (bool_2 == 1){
                System.out.println("*printer >>> " + printer + "$");
                total += printer;
            }
            System.out.println("======= Total price >>> " + total + " =======");
        }
    }
}
