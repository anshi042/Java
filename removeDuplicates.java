public class removeDuplicates {
    public static void duplicates(String str, int idx, StringBuilder sb, boolean[] map ){
        //base case 
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar -'a'] == true){
            // charater is duplicate
            duplicates(str, idx+1, sb, map);
        }else{
            //charater is not duplicate 
            map[currChar-'a'] = true;
            duplicates(str, idx+1, sb.append(currChar), map);
        }
        
    }

    public static void main(String [] args){
        String str = "aannsshhii";
        duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
    
}
