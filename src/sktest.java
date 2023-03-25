import java.util.Scanner;

public class sktest {
    public static void searchString()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray = new String[n];
        boolean found = false;
        for(int i=0;i<n;i++)
        {
            strArray[i] = sc.nextLine();
        }
        //System.out.print("Enter the String to be searched: "); 
        String str = sc.next();
        for (String s : strArray) {
            if (s.equalsIgnoreCase(str)) {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println(str + "found");
        }else{
            System.out.println(str + "not found");
        }
        sc.close();
    }
    public static void main(String[] args) {
        searchString();
    }
    
}
