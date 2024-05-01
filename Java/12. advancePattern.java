class advancePattern {
    public static void main(String[] args) {
        System.out.println();
        //upper half
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i=5; i>=1;i--){
            for(int j=1; j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // butterfly pattern
        int n= 4;
        // 1st half
        for(int i=1;i<=n;i++){
            int spaces =2*(n-i);
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            } 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                 }
                 System.out.println();
            }
            //2nd half
             for(int i=n;i>=1;i--){
                  int spaces = 2*(n-i);
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    for(int j=1;j<=spaces;j++){
                        System.out.print(" ");
                    } 
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                 }
        }
    }

