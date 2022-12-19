import java.util.*;
public class Prime_Number {
    //Function to Check whether the number is Prime or not.
    public static boolean checkPrime(int n){
        if(n==2||n==3||n==5||n==7){
            return true;
        }
        else return n % 2 != 0 && n % 3 != 0 && n % 5 != 0 && n % 7 != 0;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            System.out.println(checkPrime(n));
        }  
        catch(Exception e)  {
            System.out.println("OOPS... That's an Error , Try again Later....");
        }
    }
}