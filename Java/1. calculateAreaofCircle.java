import java.util.Scanner;

 class calculateAreaofCircle {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter radius of circle");
            int r = input.nextInt();

            float area = (float) (3.14* r*r);
            System.out.println("Area of circle "+area);
        }
    }
}