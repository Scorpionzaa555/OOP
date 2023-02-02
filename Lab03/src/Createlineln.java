import java.util.Scanner;
public class Createlineln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();
        for (int n = 1; n <= num; n++) {
            if (n%5 != 0) {
                System.out.print("|");
            } else {
                System.out.print("|");
                System.out.println();
            }
        }
        System.out.println();
    }
}
