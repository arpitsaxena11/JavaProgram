import java.util.Scanner;

class Function {
    // Greater number function
    public static int Greaternum(int num1, int num2){
        if(num1> num2){
            return num1;
        }else {
            return num2;
        }
    }

    // printing table function
    public static void table(int n){
        for (int i =1;i<=10;i++){
            System.out.println(n+"x"+i+"= "+n*i);
        }
    }

    // printing average function
    public static float average(float k ,float l ,float m){
        float average = (k+l+m)/3;
        return average;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number to print table");
            int n = sc.nextInt();
            System.out.println("Enter three numbers to print average:");
            int k = sc.nextInt();
            int l = sc.nextInt();
            int m = sc.nextInt();
            System.out.println();
            table(n);
            System.out.println();
            System.out.print("Average of three numbers will be: "+average(k, l, m));
            System.out.println();
            System.out.println("Enter two numbers to find Greater one");
            int number1= sc.nextInt();
            int number2=sc.nextInt();
            System.out.println(Greaternum(number1, number2));
        }
    }
}
