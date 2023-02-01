import java.util.Scanner;
public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a height of building : ");
        int height = sc.nextInt();
        for (int n = 1; n <= height; n++) {
            System.out.println("#-#-#-#-#");
        }
    }
}
