import java.util.*;
public class strongNumber {
    public static int factorial(int n)
    {
        if(n==0){return 1;}else{return n*factorial(n-1);}

    }
    public static boolean isStrong(int n)
    {
        int temp=n,sum=0; 
        while(temp>0){int digit = temp%10;sum+=factorial(digit);temp /=10;}
        return (sum==n);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Lower Bound of the Range : ");
            int lowerBound = sc.nextInt();
            System.out.println("Enter the Upper bound of the range : ");
            int upperBound = sc.nextInt();
            System.out.println("The Strong Numbers within the given range are : ");
            int sum =0;
            for(int i=lowerBound;i<=upperBound;i++){
                if(isStrong(i)){
                    System.out.print(i+" ");
                    sum = sum+i;
                }
            }
            System.out.println();
            System.out.println("The Sum for the Strong Number between the given range is : "+sum);
        }
        
    }
    
}
