public class week1_day_3 {
    
    
    public static boolean isPrime(int num)
    {
        if(num<2){
            return false;
        }for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void sumOfPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(isPrime(i) && isPrime(n-i))
            {
                System.out.print(i + " + " +(n-i) + " = " + (i+(n-1)));
            }
        }
    }
    public static int sumOfEven(int N)
    {
        int sum=0;
        for(int i=1;i<=N;i++)
        {
            if(i%2 == 0)
            {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //System.out.println(sumOfEven(10));
        sumOfPrime(16);
        
    }
    
}
