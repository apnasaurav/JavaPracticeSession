
public class week_1_day_4 {
    public static void findSeries(int n)
    {
        int num=4;
        int j=8;
        System.out.print(num + " ");
        for(int i=1;i<n;i++)
        {
            num = num*j;
            System.out.print(num +" ");
            j=j/2;
        }
    }
 
    public static int findValue(int n)
    {
        int i=0;
        int s=0;
        while(n>0)
        {
            int r=n%10;
            double p=Math.pow(8,i);
            s = s+(int)p*r;
            i++;
            n=n/10;     
        }
        return s;
    }
    
    public static void midPattern(int n) {
        int i,j;
        int midi = (n/2)+1;
        int midj = (n/2)+1;        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {               
               //System.out.println(midi);
               //System.out.println(midj);
                if(i == midi && j == midj)
                {
                    System.out.print("#"+" ");
                }else{
                    System.out.print("-"+ " ");
                }    
            }
            System.out.println();
        }
    }
    public static void mainPattern(int a)
    {
        int i,j,n;
        n=a;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=a;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
            a--;
        }

    }
    public static void patternNegative(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>n-i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void skJk(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void invertedPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern(int N)
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void getPattern(int n)
    {
        int l=n;
        n=3;
        System.out.print(3+" ");
        for(int i=1;i<l;i++)
        {
            n=n*2+1;
            System.out.print(n + " ");
        }
    }
    static public void main(String[] args) {
        
        //getPattern(10);
        //pattern(7);
        //invertedPattern(20);
        //skJk(5);
        //patternNegative(5);
        //System.out.println(0%1);
        //mainPattern(20);
        //midPattern(5);
        //System.out.println(1%10);
        //System.out.println(findValue(127));
        //findSeries(7);
    }  
}