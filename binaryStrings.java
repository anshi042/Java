public class binaryStrings {
    // Print all binary strings of size n without consecutive ones 
    public static void binary(int n, int lastPlace, StringBuilder str ){
        
        //Base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        /*recursion 
        if(lastPlace == 0){
            // sit 0 on chair n
            binary(n-1, 0, str.append("0"));
            binary(n-1, 1, str.append("1"));
        } else{
            binary(n-1, 0, str.append("0"));
        }*/

        //in short
        binary(n-1, 0, str+"0");
        if(lastPlace == 0){
            binary(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args){
        binary(3, 0, "");
       

    }
    
}
