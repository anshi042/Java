import java.util.*;
public class checkPalindrome { // linear time complexity og O(n)
    public static boolean isPalindrome(String str){
        for(int i =0; i<str.length()/2; i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                // palindrome
                return true;
            }  

        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str));


    }
    
}
