import java.util.*;
public class oddNeven {
    public static void eobits(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even number
            System.out.println("ven number");
        } else{
            System.out.println("odd number");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    eobits(n);

    }
    
}
