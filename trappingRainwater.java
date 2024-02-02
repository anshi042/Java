import java.util.*;
public class trappingRainwater {
    public static int trappedRainwater(int height[]){
        //calculate left max boundary-auxilary array
        int maxLeft[] = new int[height.length];
        maxLeft[0] = height[0];
        for(int i=1; i<height.length; i++){
            maxLeft[i] = Math.max(height[i], maxLeft[i-1]);
        }
        //calculate right max boundary- auxilary array
        int maxRight[] = new int[height.length];
        maxRight[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            maxRight[i] = Math.max(height[i], maxRight[i+1]);
        }
        //calculate trapped rainwater
        int trappedWater = 0;

        //loop
        for(int i=0; i<height.length; i++){
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            //trapped water = waterLevel-height[i]
            trappedWater += (waterLevel-height[i]);
        }
        
        return trappedWater;

    }
    public static void main(String [] args){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));

    }
}


//time complexity of this approach is optimum 
//time complexity is directly proportional to the no of bars given 
//time complexity if O(n)
