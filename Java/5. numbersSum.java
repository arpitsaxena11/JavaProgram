import java.util.Scanner;

class numbersSum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int sum = 0;
            for(int i =0; i <=n;i++){
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
