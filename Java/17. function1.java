import java.util.Scanner;

class fun {
    public static void age(int n){
        if (n>18){
            System.out.println("Eligible to vote");
        }else if(n<18) {
            System.out.println("Not Eligible to vote");
        }else{
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            age(n);
        }

    }

    
}











 class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        scanner.close();
    }
}

class powerfun{
    public static double power(double x , int n){
        double result = 1;
        for(int i=0;i<Math.abs(n);i++){
            result *= x;
        }
        if (n<0){
            return 1/result;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
        scanner.close();
    }
}




class GreatestCommonDivisor{

    public static void GCD(int n1, int n2){
        int g=0;
        for(int i=1; i<=n1;i++ ){
            if(n1%i==0&&n2%i==0){
                g=i;
            }
        }
        System.out.println("GCD is : "+ g);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        GCD(n1, n2);
        sc.close();
    }   
 }
 