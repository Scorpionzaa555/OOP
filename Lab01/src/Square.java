import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side, area;
        side = sc.nextInt();
        area = side*side;
        System.out.println(area);
    }
}
