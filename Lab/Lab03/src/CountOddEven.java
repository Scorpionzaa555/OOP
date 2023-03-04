import java.util.Scanner;
public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, cnt1 = 0, cnt2 = 0;
        while (num!=-1) {
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            else if (num%2 == 0) {
                cnt1 += 1;
            }
            else {
                cnt2 += 1;
            }
            System.out.println();
        }
        System.out.println("Odd number = " + cnt2 + " and Even number = " + cnt1);
    }
}
