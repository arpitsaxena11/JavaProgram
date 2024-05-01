import java.util.Scanner;

class Functions {
    public static void printfactorial(int k){
        if(k<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i=k; i>=1;i-- ){
            factorial=factorial*i;
        }
        System.out.println(factorial +" :given number factorial");
        return;
    }
    public static void Checkeven(int n){
            if(n%2==0){
                System.out.print(n+" Given number is even");
            }else{
                System.out.println(n+" Given number is odd");
            }
        }
    public static int multiply(int a , int b){
        int result= a*b;
        return result;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter number to check given number is even or not");
            int n = input.nextInt();
            System.out.println("Enter factorial number");
            int k = input.nextInt();
            Checkeven(n);
            System.out.println();
            printfactorial(k);
            System.out.println();
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(multiply(a, b));
        }
    }
   
}
