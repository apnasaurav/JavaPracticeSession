public class App {
    public static void main(String[] args) throws Exception {
        int i =0;
        int j =0;
        int n=10;
        int s;
        for(i=1;i<n;i++)
        {
            for(j=1;j<n;j++)
            {
                s=i+j;
                if((i==j || s==n) && i<=n/2)
                {
                    System.out.println(n-i);
                }
                else
                {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
    
    
}
