import java.math.BigDecimal;

public class Point {
    int l = 18;
    public static void Cont_sum(){
        double sum = 0;
        for (int i=0;i<50;i++){
            sum += 0.02;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 011;
        System.out.println(n);
        double e = 0.52;
        System.out.println(new BigDecimal(e));
        Cont_sum();
        int a = (int)12.6; // TypeCasting the Data Type..
        System.out.println(a);
        Point p = new Point();
        p.print();
        p.print1(1234);
        p.print();
        
    }
    public void print(){
        System.out.println(l);
    }
    public void print1(int l){
        System.out.println(l);
        l = 345;
    }
    
}