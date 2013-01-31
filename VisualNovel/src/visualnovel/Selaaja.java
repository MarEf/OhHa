
package visualnovel;

import visualnovel.ikkunat.*;

/**
 *
 * @author maef
 */
public class Selaaja {
    private int i = 0;
    private int j = 0;
    private Ikkunat ikkunat;
    private Ikkuna[][] taulukko;

    public Selaaja(Ikkunat ikkunat) {
        this.ikkunat = ikkunat;
        taulukko = ikkunat.getIkkunat();
    }
    
    public void seuraava() {
        
    }
    
    public Ikkuna palautaIkkuna(int i, int j) {
        return taulukko[i][j];
    }
    
    
}
