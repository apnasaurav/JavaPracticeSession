public class Sum_of_natural_no {
    // Function to find the sum of Sum of N Natural Number.
    public static int Sumofnaturalnumber(int n){
        if(n==1) return 1;
        int partialans = Sumofnaturalnumber(n-1);
        return n+partialans;
    }
    public static void main(String[] args) {
        System.out.println(Sumofnaturalnumber(12));
        if(System.out.printf("Write anything without Semi-colon") == null){

        }
        
    }
    
}
