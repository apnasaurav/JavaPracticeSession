import java.util.*;
public class week_1_assessment_lti {
    public static void SumofrowandColumn()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int tempi =0;
        int sumi=0;
        for(int i=0;i<n;i++)
        {
            sumi=0;
            for(int j=0;j<m;j++)
            {
                if(i==tempi)
                {
                    sumi+=a[i][j];

                }

            }
            System.out.println("Sum of the row "+i+" = "+sumi);
            tempi++;
        }
        tempi=0;

        for(int i=0;i<n;i++)
        {
            sumi=0;
            for(int j=0;j<m;j++)
            {
                if(i==tempi)
                {
                    sumi+=a[j][i];
                }
            }
            System.out.println("Sum of column "+i+" = "+sumi);
            tempi++;
        }
        sc.close();
    }
    
    public static void Findnonrepeatingcharacter()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int temp=-1;
        char c;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c))
            {
                temp=i;
                break;
            }
        }
        if(temp>-1&&temp<s.length())
        {
            System.out.println(temp);
        }else 
        {
            System.out.println(-1);
        }
        sc.close();

    }
    public static void main(String[] args) {
        //Findnonrepeatingcharacter();
        SumofrowandColumn();
        
    }
    
}
