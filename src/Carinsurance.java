import java.util.*;
public class Carinsurance {
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            String make = sc.nextLine();
            String model = sc.nextLine();
            int year = sc.nextInt();
            double premium = sc.nextDouble();
            int age = sc.nextInt();
            int tickets = sc.nextInt();

            CalculateCarinsurance car = new CalculateCarinsurance(make,model,year,premium);
            car.printDetails();
            System.out.println("New Premium: "+car.calculatePremium(age, tickets)
            );
        }
    }
}
class CalculateCarinsurance
{
    private String make;
    private String model;
    private int year;
    private double premium;
    CalculateCarinsurance(String make, String model, int year, double premium)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.premium=premium;
    }
    public double calculatePremium(int age, int tickets)
    {
        double newPremium=premium;
        if(age>25 )
        {
            newPremium+=1000;
        }
        if(tickets > 0)
        {
            newPremium += 500;
        }   
        return newPremium;
    }
    public void printDetails()
    {
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Premium: "+premium);
    }
}