import java.util.*;
public class Saurav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the Country Code: ");
        String countryCode = sc.nextLine();
        System.out.println("Enter the ISD: ");
        String isdCode = sc.nextLine();
        Country con = new Country(name,countryCode,isdCode);
        con.displayCountryDetails();

        
    }
    
}
class Country 
{
    String name;
    String countryCode;
    String isdCode;
    Country(String name, String countryCode, String isdCode)
    {
        this.name = name;
        this.countryCode=countryCode;
        this.isdCode=isdCode;
    }
    
    void displayCountryDetails()
    {
        System.out.println("Name of the Country: "+name);
        System.out.println("Country Code: "+countryCode);
        System.out.println("ISD COde: "+isdCode);
    }

}
