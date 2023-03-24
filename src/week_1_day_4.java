import java.util.Scanner;

public class week_1_day_4 {
    public static void Removeduplicatefromstring()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = "";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                ch = str.charAt(i);
                if(str.charAt(i)==str.charAt(j))
                {
                    continue;

                }else{
                    newStr=newStr+ch;
                }
            }
        }
        System.out.println(newStr);

    }
    public static void Matrixaddition()
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();//for row
        int columns = sc.nextInt();//for column
        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];
        //System.out.println("Enter the values of the square matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        //Input for seocnd matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        //Addition operartion
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        //Output
        //System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
    public static void Findlargestandsmallest()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Smallest Value :"+min);
        System.out.println("Largest Value :"+max);
        
    }
    public static void Deleteelement()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Take input for the length of the array
        int[] arr = new int[n];
        int[] newArr = new int[n];
        for(int i=0;i<n;i++)//Takes ipute of the Array.
        {
            arr[i]=sc.nextInt();
        }
        int element =sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            newArr[i]=arr[i];
        }
        if(count==0)
        {
            System.out.println("The Element is not present in the Array");
        }else{
            for(int i=0;i<n-1;i++)
            {
                System.out.print(newArr[i]+ " ");
            }
        }

    }

    public static void maxAbsoluteDifference()
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Comparing the Array for getting maximum value;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>min)
            {
                min=arr[i];
            }
        }
        //Comparing to find the Smallest from a array;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<max)
            {
                max=arr[i];
            }
        }
        int diff = min-max;
        System.out.println(diff);

    }
    public static void shiftArraytoRightby1()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        int[] newArr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int lastelement = arr[n-1];
        //System.out.println(lastelement);
        for(int i=1;i<n;i++)
        {
            newArr[i]=arr[i-1];
        }
        newArr[0]=lastelement; 
        for(int i=0;i<n;i++)
        {
            System.out.print(newArr[i]+ " ");
        }
    }
    public static int[] deleteSpecificElementinArray(int m)//m is the element to be removed.
    {
        int[] arr = {1,3,4,7,8,13,23,43};
        int newArray[] = {};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != m)
            {
                for(int j=0;j<newArray.length;j++)
                {
                    newArray[j] = arr[i];
                }
            }
            else{continue;}
        }
        return newArray;
    }
    public static void orderOfMatrices(int m, int n)
    {
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = i+j;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
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
        //orderOfMatrices(3, 3);//m and n are input values for the function for the order of a Matrix;
        //System.out.println(deleteSpecificElementinArray(23));
        //shiftArraytoRightby1();
        //maxAbsoluteDifference();
        //Deleteelement();
        //Findlargestandsmallest();
        //Matrixaddition();
        Removeduplicatefromstring();
        
    }  
}