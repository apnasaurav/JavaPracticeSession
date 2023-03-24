import java.util.Arrays;
import java.util.HashMap;


public class UniqueELement {

    public static void PrintUniqueElementWithoutHashMap(int[] arr)
    {
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++) {
            //If the current element is not equal to the next element
            if(arr[i] != arr[i+1]) {
              //Print the unique element
              System.out.println("The unique element is: " + arr[i]);
            }
            //Print the last element as it is always unique
            System.out.println("The unique element is: " + arr[arr.length-1]);
          }
    }

    public static void PrintUniqueElement(int [] arr)
    {
        HashMap<Integer,Integer> sk = new HashMap<>();//Sk is the name of the map what we have created
        //HashMap to store Element in a Key form
        for(int i=0;i<arr.length;i++)
        {
            sk.put(arr[i],i);
        }
        System.out.println("The Unique Elements are: "+sk.keySet());
        // Key Set outputs the unique elements.
    }
  public static void main(String[] args) {
    int[] array = {1,2,3,1,2,3,6,7,8,9,9,9};
    //PrintUniqueElement(array);
    PrintUniqueElementWithoutHashMap(array);
  }
}
