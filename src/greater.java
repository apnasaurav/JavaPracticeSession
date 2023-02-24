public class greater {
    public static int greaterNum(int a, int b, int c)
    {
        if(a>b && a>c)
        {
            return a;
        }else if(b>a && b>c)
        {
            return b;
        }else
        {
            return c;
        }

    }
    public static int checkGreaterNumber(int a, int b, int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                return a;
            }
        }else if(c>a)
        {
            if(c>b)
            {
                return c;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(greaterNum(12, 15, 65));
        System.out.println(checkGreaterNumber(1029,120, 45));
        
    }
    
}
