
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 *
 * @author maef
 */
public class Ikkuna3 extends Ikkuna{

    /**
     *
     */
    public Ikkuna3() {
        super(3, "3");
    }

    
    @Override
    public ArrayList<String> seuraavat() {
        ArrayList<String> next = new ArrayList<>();
        String seuraava = ">>";
        
        next.add(seuraava);
        return next;
    }
    
}
