public class lengthOfString {
    // WAP to find length of string using recursion 
    public static int stringLength(String str){
        
        //Base case
        if(str.length() == 0){
            return 0;
        }
        return stringLength(str.substring(1)) +1;

    }
    public static void main(String [] args){
        String str = "Anshi";
        System.out.println(stringLength(str));

    }
    
}
