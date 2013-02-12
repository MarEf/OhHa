
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 * Tällä ikkunalla hoidetaan kaikki automaattiset testit.
 * Kohteet ovat kaikki virheellisiä. 
 * 
 * @author maef
 */
public class TestiIkkuna extends Ikkuna{

    /**
     *
     */
    public TestiIkkuna() {
        super(800, "abc");
    }
    
    @Override
    public ArrayList<String> seuraavat() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
