public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            
            double sol1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double sol2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            
            System.out.println("x1 : " + sol1);
            System.out.println("x2 : " + sol2);
        }
        catch(NumberFormatException ex) {
            System.out.println("Please input data in number format only.");
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}
