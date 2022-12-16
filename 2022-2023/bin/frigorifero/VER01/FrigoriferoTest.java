import java.util.*;
public class FrigoriferoTest{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Frigorifero frigo = new Frigorifero("samsung", "f2000", 700.0);
        System.out.print("\n"+frigo.toString());
    }
}
