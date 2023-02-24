public class Shortestpath {
    public static float Pathfinder(String Str){
        // Algorithm to find shortest Path on a X-Y Plane which takes input as a string and returns
        //Integer Value.
        int x=0,y=0;
        for(int i=0;i<= Str.length()-1;i++){
            if(Str.charAt(i) == 'N')
            {
                x++;
            }
            else if(Str.charAt(i) == 'E')
            {
                y++;
            }
            else if(Str.charAt(i) == 'W')
            {
                y--;
            }
            else if(Str.charAt(i) == 'S')
            {
                x--;
            }

        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
        
    }
    public static void main(String[] args) {
        System.out.println(Pathfinder("NNWSEWEWSNW"));
        
    }
    
}
