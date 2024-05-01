 class patterns {
public static void main(String[] args) {
    int n = 4;
    int m=5;
    // First pattern
    for(int i =0; i<n; i++){
        for(int j=0; j<m; j++)
        System.out.print("*");
        System.out.println();
    }
    System.out.println();
    // Second pattern
    for(int i=0; i<n; i++){
        for(int j=0; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
    // Third pattern
    for(int i=n; i>=0;i--){
        for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
    // Fourth pattern
    for(int i=n; i>=1;i--){
        for(int j=1; j<i ;j++){
            System.out.print(" ");
        }
        for(int j=0; j<=n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();
    //Fifth pattern
    for(int i=0;i<m; i++){
        for(int j=0;j<n;j++){
            if(i==0 || i==m-1 || j==0 || j== n-1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println();
    // sixth pattern
    for(int i=1;i<=m;i++){
        for(int j=1;j<=m-i;j++){
            System.out.print(" ");
        }
        for (int j = 1;j<=m;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}    
}
