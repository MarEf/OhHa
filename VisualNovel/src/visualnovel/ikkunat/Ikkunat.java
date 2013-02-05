
package visualnovel.ikkunat;

import java.util.ArrayList;

/**
 * Säilöö kaikki Ikkuna-luokan toteuttavat oliot taulukkoon omille paikoilleen.
 * 
 * @author maef
 */
public class Ikkunat {
    private Ikkuna[][] ikkunat = new Ikkuna[5][4];

    public Ikkunat() {
    }

    public Ikkuna[][] getIkkunat() {
        return ikkunat;
    }
    
    public void lisaaIkkunat() {
        ikkunat[0][0] = new IkkunaIntro();
        ikkunat[0][1] = new Ikkuna1();
        ikkunat[0][2] = new Ikkuna2();
        ikkunat[0][3] = new Ikkuna3();
        ikkunat[0][4] = new Ikkuna4();
        
    }
}
