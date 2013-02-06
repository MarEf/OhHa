
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 *
 * @author maef
 */
public class Ikkuna4 extends Ikkuna{
    
   public Ikkuna4() {
        super(4);
    }

    @Override
    public ArrayList<String> seuraavat() {
        ArrayList<String> alku = new ArrayList<>();
        String alkuun = ("Aloita alusta");
        alku.add(alkuun);
        
        return alku;
    }
    
}
