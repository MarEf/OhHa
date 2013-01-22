
package visualnovel.ikkunat;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author maef
 */
public abstract class Ikkuna {

    private int sivunumero;
    
    public Ikkuna() {
    }
    
    public File haeTeksti() throws FileNotFoundException {
        File teksti = new File("src/visualnovel/ikkunat/"+sivunumero+".txt");
        
        return teksti;
    }
    
    public void haeKuva() {
        //Tämä ei tee toistaiseksi vielä mitään.
        //Graafisessa käyttöliittymässä tämä hakee tekstiin sopivan kuvan
        //ja asettaa sen taustalle.
    }
    
    public abstract void jatka(); //Käynnistää pelaajan valinnan perusteella seuraavan ikkunan.

    public void setSivunumero(int sivunumero) {
        this.sivunumero = sivunumero;
    }
}
