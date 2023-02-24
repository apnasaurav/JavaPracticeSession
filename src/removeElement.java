public class removeElement {
    public static void main(String[] args) {
        int count =0;
        int []arr = {1,2,3,4,3,3,5};
        int val= 3;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i] != val)
            {
                continue;
            }
            arr[count] = arr[i];
            count++;
        }
        System.out.println(count);
    }
    
}
