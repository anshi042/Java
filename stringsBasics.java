import java.util.*;
public class stringsBasics {

    //function to print all characters of the string
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz@#1234");

        // //strings are IMMUTABLE(non changable)
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine(); //only for a single word
        // System.out.println(name);

        // String fullName = "Shaurya Saraswat";
        // System.out.println(fullName);
        // System.out.println("The length of this name is: " + fullName.length());

        //concatenation
        String firstName = "Anshi";
        String lastName = "Sharma";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.charAt(2));

        printLetters(fullName);






    }
}
