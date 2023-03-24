public class code {
    public static int[] doubleArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]*2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int[] dobuledNumbers = doubleArray(numbers);
        
        
    }
    
}
