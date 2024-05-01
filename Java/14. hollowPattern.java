class hollowPattern {
    public static void main(String[] args) {


                // hollow butterfly pattern
                int n= 4;
                // 1st half
                for(int i=1;i<=n;i++){
                    int spaces =2*(n-i);
                    for(int j=1;j<=i;j++){
                        if(i==1|| j==1|| i==j ){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    for(int j=1;j<=spaces;j++){
                        System.out.print(" ");
                    } 
                        for(int j=1;j<=i;j++){
                            if(i==1|| j==1|| i==j ){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                         }
                         System.out.println();
                    }


                    // 2nd half
                for(int i=n;i>=1;i--){
                    int spaces =2*(n-i);
                    for(int j=1;j<=i;j++){
                        if(i==1|| j==1|| i==j ){
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    for(int j=1;j<=spaces;j++){
                        System.out.print(" ");
                    } 
                        for(int j=1;j<=i;j++){
                            if(i==1|| j==1|| i==j ){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                         }
                         System.out.println();
                    }

















                    // hollow rectangle
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=5;j++){
                            if(i==1 || i==5 || j==1 || j== 5){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                
    }    
}
