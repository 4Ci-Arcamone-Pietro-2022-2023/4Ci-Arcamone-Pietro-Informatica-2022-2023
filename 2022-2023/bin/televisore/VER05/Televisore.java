import java.util.*;
public class Televisore
{
    private int pollici = 0;
    private String schermo = "anonimo";
    private String colore = "anonimo";
    private int canale = 0;
    private int volume = 0;
    private int luminos = 50;
    private boolean acceso = false;
    public Televisore(int pollici, String schermo, String colore){
         if(pollici>0){
             this.pollici=pollici;
         }
         if(schermo!=null){
             this.schermo=schermo;
         }
         if(colore!=null){
             this.colore=colore;
         }
    }
    //02
     public void accendi(){
        this.acceso = true;
    }
    public void spegni(){
        this.acceso = false;
    }
    //03
    public int getPollici(){
        return this.pollici;
    }
    public void setPollici(int p){
        if(p>0){
            this.pollici=p;
        }
    }
    //04
     public String getSchermo(){
        return this.schermo;
    }
    public void setSchermo(String s){
        if(s!=null){
            this.schermo=s;
        }
    }
    //05
    public String getColore(){
        return this.colore;
    }
    public void setColore(String color){
        if(color!=null){
            this.colore=color;
        }
    }
    //
    public String toString(){
        String out="";
        out="\nPollici: "+this.pollici;
        out+="\nSchermo: "+this.schermo;
        out+="\nColore: "+this.colore;
        out+="\nCanale: "+this.canale;
        out+="\nVolume: "+this.volume;
        out+="\nLuminosità: "+this.luminos;
        if(this.acceso){
            out+="\nAcceso";
        }else{
            out+="\nSpento";
        }
        return out;
    }
}
