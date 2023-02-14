import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble(), total = 0;
        
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char type = sc.next().charAt(0);
        
        if ((type == 'A') && (type == 'C')) {
            total = money * 1.015;
        } else if (type == 'B') {
            total = money * 1.02;
        } 
        if (type == 'X') {
            total = money * 1.05;
        }
        System.out.print("Your total money in one year = ");
        System.out.print(total);
    }
}
