public class compareStrings {

    public static void main(String [] args){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");


        // shows equal (here s2 is pointing the tony from s1 because its already created that's why they are equal)
        if(s1 == s2){   
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        //shows not equal due to the concept of -- Interning , that's why we don't use == for comparision in strings
        if(s1 == s3){   
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        // using equals function to check 
        if(s1.equals(s3)){   
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
        
    }
    
}
