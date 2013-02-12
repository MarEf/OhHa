
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 *
 * @author maef
 */
public class Ikkuna2  extends Ikkuna{
    
     /**
     *
     */
    public Ikkuna2() {
        super(2, "2");
    }
    
    @Override
    public ArrayList<String> seuraavat() {
        ArrayList<String> next = new ArrayList<>();
        String seuraava = ">>";
        next.add(seuraava);
        
        return next;
    }
    
}
