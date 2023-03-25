import java.util.*;
public class SumMatrixwithrx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the matrix: ");
        int n = sc.nextInt();
        int A[],B[];
        A = new int[n*n];
        B = new int[n*n];
        for(int i=0;i<n*n*2;i++)
        {
            if(i==0 && i%(n*n)==0)
            {
                System.out.println("Enter the Data for matrix A");
                A[i]=sc.nextInt();
            }else if(i/(n*n)==1)
            {
                if(i==n*n && i%(n*n)==0)
                {
                    System.out.println("Enter the Data for matrix B");
                    int x = sc.nextInt();
                    B[i-(n*n)]=x+A[i-(n*n)];
                }
            }

        }
        System.out.println("The Sum of these two matrix is : ");
        for(int i=0;i<n*n;i++)
        {
            if(i%n==0)
            {
                System.out.println("\n");
                System.out.println(B[i]+" ");

            }

        }
        sc.close();
    }
    
}
