//get ith bit
import java.util.*;
public class bitm2{
    public static int  getithbit(int n, int i){
        int bitmask = 1<<i;
        if((n& bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.print( getithbit(10, 2));
    }
}