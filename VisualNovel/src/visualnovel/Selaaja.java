
package visualnovel;

import visualnovel.ikkunat.*;

/**
 * Luokka pitää kirjaa siitä, missä kohdassa tarinaa (kohdassa taulukkoa) 
 * ollaan parhaillaan menossa.
 *
 * @author maef
 */
public class Selaaja { 
    private int i = 0;
    private int j = 0;
    private Ikkunat ikkunat;
    private Ikkuna[][] taulukko;

    /**
     *
     * @param ikkunat
     */
    public Selaaja(Ikkunat ikkunat) {
        this.ikkunat = ikkunat;
        taulukko = ikkunat.getIkkunat();
    }

    /**
     *
     * @return
     */
    public int getI() {
        return i;
    }

    /**
     *
     * @param i
     */
    public void setI(int i) {
        if (i>5 || taulukko[i][j] == null) {
            this.i = 0;
            this.j = 0;
        }
        else {
            this.i = i;
        }
    }

    /**
     *
     * @return
     */
    public int getJ() {
        return j;
    }

    /**
     *
     * @param j
     */
    public void setJ(int j) {
        if (j>4 || taulukko[i][j] == null) {
            this.j = 0;
            this.i = 0;
        }
        else {
            this.j = j;
        }
    }
    
    /**
     *
     * @return
     */
    public Ikkuna palautaIkkuna() {
        return taulukko[i][j];
    }
    
    
}
