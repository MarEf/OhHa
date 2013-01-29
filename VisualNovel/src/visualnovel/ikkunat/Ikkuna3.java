
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 *
 * @author maef
 */
public class Ikkuna3 extends Ikkuna{

    public void setSivunumero() {
        this.sivunumero = 3;
    }

    
    @Override
    public ArrayList<String> seuraavat() {
        ArrayList<String> next = new ArrayList<>();
        String seuraava = ">>";
        
        next.add(seuraava);
        return next;
    }
    
}
