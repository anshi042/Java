public class stringCompression {

    // String compression without using string Builder
    public static String compress(String str){
       String newStr = "";
       
       for(int i=0; i<str.length(); i++){
        Integer count = 1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count ++;
            i++;
        }
        newStr += str.charAt(i);
        if(count>1){
            newStr += count.toString();
        }
       }
       return newStr;
    }

    //String compression using String Builder
    public static String compressString(String str){
        StringBuilder sb =  new StringBuilder("");
        int count = 1;
        for(int i=0; i<str.length(); i++){
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            } sb.append(str.charAt(i));
              sb.append(count);
              count =1;
        }

        return sb.toString();

    }
    public static void main(String [] args){
        String str = "ssssaaaassssssss";
        //System.out.println(compress(str));
        System.out.println(compressString(str));
    }
    
}
