import java.util.*;
public class Animal {
    
    private int legs;
    private int ears;
    private int eyes;
    void setLegs()
    {
        
       try (Scanner sc = new Scanner(System.in)) {
        this.legs = sc.nextInt();
           this.ears = sc.nextInt();
           this.eyes = sc.nextInt();
    }
    }
    void viewinfo()
    {
        System.out.println("Legs: "+legs);
        System.out.println("Ears: "+ears);
        System.out.println("Eyes: "+eyes);
    }
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.setLegs();
        System.out.println("The Common feature of Animal is : ");
        ani.viewinfo();
        
    }
    
}
