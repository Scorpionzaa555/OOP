import java.util.Scanner;
public class HourMinuteToSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour, minute, second;
        hour = sc.nextInt();
        minute = sc.nextInt();
        second = (hour*3600)+(minute*60);
        System.out.println(second);
    }
}
