public class numberToString {
    /*you are given a number(eg 2004) convert it into String of english like 
     * "two zero zero four" . use a recursive function to solve this problem
     * NOTE - the digit of number will only b in range 0-9 and the last digit 
     * of number can't be 0 */
    static String digits[] = {"zero", "one", "two", "three","four","five","six","seven","eight","nine"};

    public static void printString(int n){
        //Base case
        if(n == 0){
            return;
        }

        //Recursion
        int lastDigit = n%10;  //calculating last digit of the integer
        printString(n/10);  //removing last digit of the given number
        System.out.print(digits[lastDigit]+ " ");
    }
    public static void main(String []args){
        printString(2004);

    }
}
