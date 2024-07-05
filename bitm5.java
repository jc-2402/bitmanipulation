//update ith bit
import java.util.*;
public class bitm4{
    public static int  clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return  n & bitmask;
    }
    public static int updateithbit(int n, int i, int newbit){
        n = clearithbit(n, i);
        int bitmask = newbit << i;
        return n| bitmask;
    }
    public static void main(String[] args) {
        System.out.print( updateithbit(10,2, 1));
    }
}