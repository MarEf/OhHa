
package visualnovel.ikkunat;

import java.awt.*;
import java.io.*;

/**
 *
 * @author maef
 */
public abstract class Ikkuna {
    
    protected int sivunumero;
    protected String kuvanTunnus;
    
    public Ikkuna() {
    }
    
    public File haeTeksti() throws FileNotFoundException {
        File teksti = new File("src/visualnovel/ikkunat/tekstit/"+sivunumero+".txt");
        
        return teksti;
    }
    
    public void haeKuva() {
        
        //Tämä ei tee toistaiseksi vielä mitään.
        //Graafisessa käyttöliittymässä tämä palauttaa tekstiin sopivan kuvan
    }
    
    public abstract void jatka(); //Käynnistää pelaajan valinnan perusteella seuraavan ikkunan.

}
