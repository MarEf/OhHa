
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 *
 * @author maef
 */
public class Ikkunat {
    private ArrayList<Ikkuna> ikkunat = new ArrayList<>();

    public Ikkunat() {
    }

    public ArrayList<Ikkuna> getIkkunat() {
        return ikkunat;
    }
    
    public void lisaaIkkunat() {
        ikkunat.add(new IkkunaIntro());
        ikkunat.add(new Ikkuna1());
        ikkunat.add(new Ikkuna2());
        ikkunat.add(new Ikkuna3());
        ikkunat.add(new Ikkuna4());
        
    }
}
