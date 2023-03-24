import java.util.*;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch(str)
        {
            case "Parrot":
            new Parrot();
            break;
            case "Kiwi":
            new Kiwi();
            break;
            case "Cocktail":
            new Cocktail();
            break;
            default:
            System.out.println("Invaild Input");
        }
	}
}

class Birds
{
    public Birds()
    {
        System.out.print("Birds : ");
    }
}
class Parrot extends Birds
{
    public Parrot ()
    {
        System.out.print("Grey Parrot");
    }
}
class Cocktail extends Birds{
    public Cocktail()
    {
        System.out.print("Grey Cocktail");
    }
}
class Kiwi extends Birds
{
    public Kiwi()
    {
        System.out.print("Grey Kiwi");
    }
}