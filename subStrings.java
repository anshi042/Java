public class subStrings {
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String [] args){
        //SubString
        String str = "HelloWrld";
        //Inbuilt function in java
        System.out.println(str.substring(0,4));
        // created function in java
        System.out.println(subString(str, 0, 4));
    }
    
}
