public class Fibonacci {
    public static void Findfibonacciseries(int N){
        int t1=0,t2=1;
        int t3;
        System.out.print(t1 + " "+t2+ " ");
        for(int i=2;i<N;i++)
        {
            t3=t1+t2;
            System.out.print(t3+ " ");
            t1=t2;
            t2=t3;
        }   
    }


    public static void main(String[] args) {
        Findfibonacciseries(7);
        
    }
    
}
