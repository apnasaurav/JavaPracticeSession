

import java.util.ArrayList;
import java.util.List;
public class password {
    public List<String> filter (List<String> passwords)
    {
        List<String> filteredPasswords = new ArrayList<>();
        for(String password : passwords)
        {
            if (password.length()<5)
            {
                filteredPasswords.add(password);
                continue;
            }
            if(password.matches("[a-zA-Z]+") ||password.matches("[0-9]+"))
            {
                filteredPasswords.add(password);
                continue;
            }

        }
        List<String> result = new ArrayList<>(passwords);
        result.removeAll(filteredPasswords);
        return result;
    }
    
    public static void main(String[] args) {
        
        
    }
    
}
