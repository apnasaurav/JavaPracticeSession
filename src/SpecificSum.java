import java.util.*;
public class SpecificSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int element = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]+arr[j]==element)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        sc.close();

        
    }
    
}
