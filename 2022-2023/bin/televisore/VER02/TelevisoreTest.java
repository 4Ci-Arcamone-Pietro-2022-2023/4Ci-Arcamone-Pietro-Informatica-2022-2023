import java.util.*;
public class TelevisoreTest{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Televisore tv = new Televisore(27, "4k", "a colori");
        System.out.print(tv.toString());
        tv.accendi();
        System.out.print("\n"+ tv.toString());
        tv.spegni();
        System.out.print("\n"+ tv.toString());
    }
}
