import java.util.Scanner;

class calculateOperations {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println("Addition "+ (a+b));
            System.out.println("subtraction "+ (a-b));
            System.out.println("Multiplication "+ (a*b));
            System.out.println("Division "+ (a/b));
            System.out.println("Modulo "+ (a%b));
        }
    }
    
}
