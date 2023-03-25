//import java.io.*;
import java.util.*;
public class rowsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
       // sc.nextLine();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            //sc.nextLine();
        }
        int sumRow,sumCol;
        for(int i=0;i<row;i++)
        {
            sumRow=0;
            for(int j=0;j<col;j++)
            {
                sumRow = sumRow+arr[i][j];
            }
            System.out.println("Sum of row "+i+" = "+sumRow);
        }
        for(int i=0;i<col;i++)
        {
            sumCol=0;
            for(int j=0;j<row;j++)
            {
                sumCol=sumCol+arr[i][j];
            }
            System.out.println("Sum of column "+i+" = "+sumCol);
        } 
        sc.close();    
    }  
}
