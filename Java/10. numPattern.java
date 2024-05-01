class numPattern{
    public static void main(String[] args) {
        int n =5;
        // 1 pattern
        for (int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        //2 pattern
        for(int i=n; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        // 3 pattern
        int num=1;
        for ( int i =1; i<=n;i++){
            for(int j=1;j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
        // 4 pattern
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
    }
}