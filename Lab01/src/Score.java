import java.util.Scanner;
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        double avg;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        avg = (x+y+z)/3;
        System.out.println(avg);
    }
}
