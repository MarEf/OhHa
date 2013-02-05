
package visualnovel;

import visualnovel.ikkunat.*;

/**
 *
 * @author maef
 */
public class Selaaja { //Pidetään kirjaa siitä, mitä ikkunaa ollaan parhaillaan näyttämässä.
    private int i = 0;
    private int j = 0;
    private Ikkunat ikkunat;
    private Ikkuna[][] taulukko;

    public Selaaja(Ikkunat ikkunat) {
        this.ikkunat = ikkunat;
        taulukko = ikkunat.getIkkunat();
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    
    public Ikkuna palautaIkkuna() {
        return taulukko[i][j];
    }
    
    
}
