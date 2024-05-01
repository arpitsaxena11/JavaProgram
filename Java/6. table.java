import java.util.Scanner;

class table {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number to print a table");
            int n = input.nextInt();
            for (int i =1;i<=10;i++){
                System.out.println(n+"x"+i+"= "+n*i);
            }
        }
    }
}
