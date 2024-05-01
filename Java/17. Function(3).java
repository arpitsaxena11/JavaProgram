import java.util.Scanner;

class function{
    public static void printoddsum(int n){
        int sum =0;
        for(int i=1; i<=n; i++ ){
            if(i%2!=0){
                sum= sum+i;
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter number to find odd numbers sum\n");
            int n = input.nextInt();
            printoddsum(n);
        }

    }
}