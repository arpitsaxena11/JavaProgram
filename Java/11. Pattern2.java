class Pattern2 {
    public static void main(String[] args) {
        
    // 1 pattern
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    System.out.println();
    // 2 pattern
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        for(int j=2;j<=i;j++){
            System.out.print(j+ " ");
        }
        System.out.println();
    }
}
}
