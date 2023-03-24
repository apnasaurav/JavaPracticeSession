public class Love {
    

    public static String reveString(String str){
        char arr[] = str.toCharArray();
        String revString = " ";
        for(int i=arr.length-1;i<=0;i--){
            revString += arr[i];
            


        }
        return revString;

        
    }
    

    public static void main(String[] args) {
        String str = "love";
        System.out.println(reveString(str));
    }
    
}
