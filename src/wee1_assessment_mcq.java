public class wee1_assessment_mcq {
    public static void q1() {
        String name ="workhard";
        name.concat("Success");
        System.out.println(name);     
    }

    public static void q3()//This code will show NullPointer exception
    {
        String str = "";
        switch(str)
        {
            case "null":
            System.out.println("null String");
            break;

        }
    }
    public static void q13()
    {
        int arr[] = {10,22,34,64,80};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void qq()
    {
        int[] A = {10,5,2,1,3};
        for(int i=0;i<A.length;i++)
        {
            A[i]=A[(A[i]+3)%A.length];
        }
        System.out.printf("%d",A[1]);
    }

    public static void main(String[] args) {
       // q1();
       //q3();
       //q13();
       qq();
    }
    
}
