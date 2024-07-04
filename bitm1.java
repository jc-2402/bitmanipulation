//bit manipulation
//check if no is odd or even 
import java.util.*;
public class bitm1{
    public static void oddoreven(int num){
        int bitmask = 1;
        if((num & bitmask) ==0){
            System.out.print("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddoreven(5);
        oddoreven(11);
        oddoreven(14);
    }
}