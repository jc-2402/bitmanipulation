//set ith bit
import java.util.*;
public class bitm3{
    public static int  setithbit(int n, int i){
        int bitmask = 1<<i;
        return  n | bitmask;
    }
    public static void main(String[] args) {
        System.out.print( setithbit(10, 2));
    }
}