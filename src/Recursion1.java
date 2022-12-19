public class Recursion1 {
    public static int FindFact(int n){
        if (n==0) return 1;
        int partialans = FindFact(n-1);
        return n*partialans;
    }

    public static int FindSum(int n){
        if (n==1) return 1;
        int partialans = FindSum(n-1);
        return n+partialans;
    }
    public static void main(String[] args) {
        System.out.println(FindFact(12));
        System.out.println(FindSum(4));
        
    }
    
}
