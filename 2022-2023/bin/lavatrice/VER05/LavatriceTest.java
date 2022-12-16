import java.util.*;
public class LavatriceTest{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Lavatrice lava = new Lavatrice("bosch", "t3000", 200.0);
        System.out.print(lava.toString());
        //02
        lava.accendi();
        System.out.print("\n" + lava.toString());
        lava.spegni();
        System.out.print("\n" + lava.toString());
        //03
        lava.setMarca("bosch");
        System.out.print("\n" + lava.getMarca());
        //04
        lava.setModello("t3000");
        System.out.print("\n" + lava.getModello());
        //05
        lava.setProgramma(2);
        System.out.print("\n" + lava.getProgramma());
        lava.aumentaProgramma();
        System.out.print("\n" + lava.getProgramma());
        lava.diminuisciProgramma();
        System.out.print("\n" + lava.getProgramma());
    }
}
