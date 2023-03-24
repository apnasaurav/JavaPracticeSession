public class arrayevensum {
    public static int sumPositiveEven(int[] arr)
    {
        int sum=0;
        for(int num : arr)
        {
            if(num>0&&num%2==0)
            {
                sum += num;
            }
        }
        if(sum<0)
        {
            sum =-sum;
        }
        if(sum==0)
        {
            return -1;
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
    
}
