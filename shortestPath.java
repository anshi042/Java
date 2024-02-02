import java.util.Scanner;
public class shortestPath { //linear time complexity O(n)

    public static float findPath(String str){
        int x=0,y=0;
       for(int i=0; i<str.length(); i++){
        char dir = str.charAt(i);
        //south
        if(dir == 'S'){
            y--;
        }else if(dir == 'N'){
            y++;
        }else if(dir == 'W'){
            x--;
        }else{
            x++;
        }
       } 
       //{(x2-x1)^2 + (y2-y1)^2}^1/2 == shortest path
       int X2 = x*x;
       int Y2 = y*y;
       return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(findPath(str));

    }
    
}
