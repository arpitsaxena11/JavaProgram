import java.util.*;
class Arrays {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int numbers[] = new int[size];

       // For Input
       for(int i=0; i<size; i++) {
           numbers[i] = sc.nextInt();
       }

       //print the numbers in array -- Output
       for(int i=0; i<numbers.length; i++) {
           System.out.print(numbers[i]+" ");
       }
       sc.close();
   }
}
class Arrays2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of Name");
        int size = sc.nextInt();
        String names [] = new String[size];
        //For input
        for(int i =0; i<size;i++){
            System.out.println("Enter name "+(i+1));
            names[i]= sc.next();
            
        }

        //Output
        for(int i=0; i<names.length;i++){
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }
        sc.close();
    }
}

class  Arrays3{
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of Integer to find");
    int size = sc.nextInt();
    int numbers[] = new int[size];


    //input
    for(int i=0; i<size; i++) {
        numbers[i] = sc.nextInt();
    }


    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
   
     for(int i=0; i<numbers.length; i++) {
         if(numbers[i] < min) {
             min = numbers[i];
         }
         if(numbers[i] > max) {
             max = numbers[i];
         }
     }


     System.out.println("Largest number is : " + max);
     System.out.println("Smallest number is : " + min);
     sc.close();
    
 }
}
class array4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array input");
        int size = sc.nextInt();
        int arr[]= new int[size];

        for(int i=0; i<size;i++){
            arr[i]= sc.nextInt();
        }

        boolean isAscending = true;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending =false;
            }
        }
        if (isAscending) {
            System.out.println("Array Sorted in Ascending order");
        }
        else{
            System.out.println("Array not sorted in ascending order");
        }
    }
}