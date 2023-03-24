import java.util.Scanner;

public class getmatxrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // get the order of the matrices
            //System.out.print("Enter the number of rows: ");
            int m = sc.nextInt();
            //System.out.print("Enter the number of columns: ");
            int n = sc.nextInt();

            // create the matrices
            int[][] mat1 = new int[m][n];
            //int[][] mat2 = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // add the values of the index positions
                    mat1[i][j] = i + j;
                    //mat2[i][j] = i + j;
                }
            }
            // print the matrices
            //System.out.println("Matrix 1:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }
        }

        /* System.out.println("Matrix 2:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        } */
    }
}
