import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble(), area;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);
}
}
