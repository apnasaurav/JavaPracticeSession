
import java.util.*;
public class Application {
    public static void Printcommonelement()
    {
        //Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        //List<Integer> list = List.of(1, 2, 3, 4);
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr2.add(3);
        arr2.add(6);
        arr2.add(4);
        arr2.add(9);


        /* System.out.print("Enter The Length of First Array : ");
        int n = sc.nextInt();
        System.out.print("Enter The Length of Second Array : ");
        int m = sc.nextInt();
        
        //Taking Input for First Array
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter for element of arr1 for "+(i+1));
            arr1.add(sc.nextInt());
        }
        //Taking input for Second Array : 
        for(int i=0;i<m;i++)
        {
            System.out.print("Enter for element of arr2 for "+(i+1));
            arr2.add(sc.nextInt());
        }
        */

        
        arr2.retainAll(arr1);
        System.out.println(arr2);
        //System.out.println(list);
      
    }


    public static void main(String[] args) {
        Printcommonelement();
        
    }

}
