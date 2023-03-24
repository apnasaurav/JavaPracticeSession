import java.util.*;
public class help {
        String name;
        String street;
        int pincode;
        String country;
        void takeInput() //By USing this function you can take input form the user for name street pincode and country..
        {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the Name : ");
                this.name = sc.nextLine();
                System.out.println("Enter the Street/Locality : "); 
                this.street = sc.nextLine();
                System.out.println("Enter the Pincode : ");
                this.pincode = sc.nextInt();
                System.out.println("Enter the Country : ");
                this.country = sc.nextLine();
            }
        }
        void info()
        {
            System.out.println("Name : "+name);
            System.out.println("Street "+street);
            System.out.println("Pincode : "+pincode);
            System.out.println("Country : "+country);
        }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        
        
        help ad = new help();
        ad.takeInput();
        
        //ad.name = sc.nextLine();  This code is also working fine as you can take input individually..
        ad.info();


        
    }
    
    
}
