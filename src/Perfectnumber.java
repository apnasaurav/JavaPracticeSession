public class Perfectnumber {
    /*
     Perfect Number : a positive integer that is equal to the sum of its proper divisors. 
     The smallest perfect number is 6, which is the sum of 1, 2, and 3 followed by 28, 496, 8128.
     */
    //function to Find the sum of the given number which is divisible
    public static int Finddivisibilitysum(int n){
        int sum =0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum += i;
            }else{
                continue;
            }
        }
        return sum;
    }
    //Function to Check Whether the given number is Perfect ot not?.
    public static boolean Checkperfectnumber(int num){
        if((Finddivisibilitysum(num))==num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Checkperfectnumber(6));
    }
    
}
