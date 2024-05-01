class advancePattern2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        

        int m = 4;
        for (int j = 1; j <= m; j++ ) {
            for (int i = m - j + 1; i >= 1; i--) {
                System.out.print(j);
            }
            System.out.println();
        }

System.out.println();
System.out.println();
System.out.println();




        // Print Pascal's Triangle in Java
		for (int line = 1; line <= n; line++) {
			for (int j = 0; j <= n - line; j++) {

				// for left spacing
				System.out.print(" ");
			}

			// used to represent C(line, i)
			int C = 1;
			for (int i = 1; i <= line; i++) {

				// The first value in a line is always 1
				System.out.print(C + " ");
				C = C * (line - i) / i;
			}
			System.out.println();
            }
        }
    }

