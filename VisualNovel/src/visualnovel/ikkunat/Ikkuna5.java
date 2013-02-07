
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 *
 * @author maef
 */
public class Ikkuna5 extends Ikkuna{
    
    public Ikkuna5() {
        super(5);
    }
    
    @Override
    public ArrayList<String> seuraavat() {
        ArrayList<String> next = new ArrayList<>();
        String a = "1. Minä: \"Kiitos. On paljon mukavampaa, jos on kaveri mukana.\"";
        String b = "2. Minä: \"Pärjään kyllä. Kiitos kuitenkin.\" (Lähtee kiireellä)";
        
        next.add(a);
        next.add(b);
        
        return next;
    }
}
