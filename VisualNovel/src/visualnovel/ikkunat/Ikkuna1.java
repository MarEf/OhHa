
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 *
 * @author maef
 */
public class Ikkuna1 extends Ikkuna{

    public void setSivunumero() {
        this.sivunumero = 1;
    }
    
    @Override
    public ArrayList<String> seuraavat() {
        ArrayList<String> next = new ArrayList<>();
        String a = "1. Minä: \"Itseasiassa äiti käski mennä suoraan kotiin. Ehkä huomenna.\" (Vilkutus)";
        String b = "2. Minä: Äiti käski mennä suoraan kotiin, mutta... \"Kuulostaa hyvältä! Mennään.\"";
        
        next.add(a);
        next.add(b);
        
        return next;
    }
    
}
