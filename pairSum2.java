import java.util.ArrayList;
//Find if any paqir in a Sorted & rotated ArrayList has a target sum
public class pairSum2 {

    //brute force -- o(n^2)
    public static boolean pairsum (ArrayList<Integer> list, int target){

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }  
            }         
        }
        return false;
     }


     //Two pointer approach -- Linear tiime complexity
     public static boolean pairSum (ArrayList<Integer> list, int target){
         
        // finding pivot point 
        int bp = -1;
        int n = list.size();
        for(int i =0; i < list.size(); i++){
            if(list.get(i) > list.get(i+1)){ // breaking point 
                bp = i;
                break;

            }
        }

        // pointers 
        int lp = bp +1; //smallest
        int rp = bp; //largest 

        while(lp != rp){
            // case1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            // case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;

     }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        System.out.println(pairSum(list, target));
    }
}
