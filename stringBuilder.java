public class stringBuilder { //StringBuilder gives memory efficiency
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch<='z'; ch++){
            sb.append(ch);
            //abcdefghijklmnopqrstuvwxyz
            //O(26)
            //O(26 * N)  N = size of string in which we want to append our characters
        }
        System.out.println(sb);
    }
}
