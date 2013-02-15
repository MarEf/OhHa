
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 *
 * Luokkaa käytetään säilömään nappeihin tulevat vastausvaihtoehdot listoihin
 * listojen sisällä.
 * @author maef
 */
public class Vaihtoehdot {
 
    private int ikkunanNumero;
    private ArrayList<ArrayList>vaihtoehdot = new ArrayList<>();

    /**
     * 
     * @param ikkunanNumero 
     */
    public Vaihtoehdot(int ikkunanNumero) {
        lisaaVaihtoehdot();
        this.ikkunanNumero = ikkunanNumero;
    }
    
    public ArrayList<String> palautaVaihtoehdot() {
        
        return vaihtoehdot.get(ikkunanNumero);
    }
    
    private void lisaaVaihtoehdot() {
        ArrayList<String> a = new ArrayList<>();
        a.add("Aloita");
        vaihtoehdot.add(a);
        
        ArrayList<String> b = new ArrayList<>();
        b.add("1. Minä: \"Itseasiassa äiti käski mennä suoraan kotiin. Ehkä huomenna.\" (Vilkutus)");
        b.add("2. Minä: Äiti käski mennä suoraan kotiin, mutta... \"Kuulostaa hyvältä! Mennään.\"");
        vaihtoehdot.add(b);
        
        ArrayList<String> c = new ArrayList<>();
        c.add(">>");
        vaihtoehdot.add(c);

        vaihtoehdot.add(c);
        
        ArrayList<String> e = new ArrayList<>();
        e.add("Aloita alusta");
        vaihtoehdot.add(e);
        
        ArrayList<String> f = new ArrayList<>();
        f.add("Kiitos Mari! Ystävän kanssa on aina helpompaa.");
        f.add("Pärjään kyllä. Kiitos kuitenkin! (Nousee ylös ja lähtee kotiin)");
        vaihtoehdot.add(f);
        
        vaihtoehdot.add(c);
        
        vaihtoehdot.add(c);
        
        vaihtoehdot.add(c);
        
        vaihtoehdot.add(e);
        
        vaihtoehdot.add(c);
        
        vaihtoehdot.add(e);
        
    }
}