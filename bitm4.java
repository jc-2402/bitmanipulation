//clear ith bit
import java.util.*;
public class bitm4{
    public static int  clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return  n & bitmask;
    }
    public static void main(String[] args) {
        System.out.print( clearithbit(10, 1));
    }
}