import java.util.*;
class Function {
  public static void printSum(int n) {
       int sum = 0;
      for(int i=1; i<=n; i++) {
        if(i % 2 != 0) {
            sum = sum + i;
        }
      }
      System.out.println(sum);
   }
   public static void Circle(int k){
    double circum = 2*Math.PI*k;
    System.out.println("Circumference of circle will be: "+circum);
   }
   public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
          printSum(n);
          System.out.println();
          int k =sc.nextInt();
          Circle(k);
    }
   }   
}

