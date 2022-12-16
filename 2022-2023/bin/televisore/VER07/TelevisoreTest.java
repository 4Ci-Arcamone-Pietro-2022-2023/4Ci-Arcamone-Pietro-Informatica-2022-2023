import java.util.*;
public class TelevisoreTest{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Televisore tv = new Televisore(27, "4k", "a colori");
        System.out.print(tv.toString());
        //02
        tv.accendi();
        System.out.print("\n"+ tv.toString());
        tv.spegni();
        System.out.print("\n"+ tv.toString());
        //03
        tv.setPollici(27);
        System.out.print("\n\n"+ tv.getPollici());
        //04
        tv.setSchermo("4k");
        System.out.print("\n\n"+ tv.getSchermo());
        //05
        tv.setColore("a colori");
        System.out.print("\n\n"+ tv.getColore());
        //06
        tv.setCanale(41);
        System.out.print("\n\n"+ tv.getCanale());
        tv.aumentaCanale();
        System.out.print("\n"+ tv.getCanale());
        tv.diminuisciCanale();
        System.out.print("\n"+ tv.getCanale());
        //07
        tv.setVolume(33);
        System.out.print("\n\n"+ tv.getVolume());
        tv.aumentaVolume();
        System.out.print("\n"+ tv.getVolume());
        tv.diminuisciVolume();
        System.out.print("\n"+ tv.getVolume());
    }
}
