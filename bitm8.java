//check if a no. is power of 2 or not
import java.util.*;
public class bitm8{
    public static boolean ispower(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(ispower(9));
    }
}