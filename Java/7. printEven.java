import java.util.Scanner;

class printEven {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for(int i=0 ; i<=n; i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
