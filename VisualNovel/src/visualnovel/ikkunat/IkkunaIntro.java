package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 *
 * @author maef
 */
public class IkkunaIntro extends Ikkuna {

    public void setSivunumero() {
        this.sivunumero = 0;
    }
    
    @Override
    public ArrayList<String> seuraavat() {
        ArrayList<String> next = new ArrayList<>();
        String aloita = "Aloita";
        
        next.add(aloita);
        return next;
    }
    
    
}
