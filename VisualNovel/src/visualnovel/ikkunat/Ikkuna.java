
package visualnovel.ikkunat;

import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * Pohja luokille, jotka hakevat itseensä liittyvän kuva- ja tekstitiedoston.
 * 
 * @author maef
 */
public abstract class Ikkuna {
    
    protected int sivunumero;
    protected String kuvanTunnus;
    
    /**
     *
     * @param numero
     * @param tunnus
     */
    public Ikkuna(int numero, String tunnus) {
        this.sivunumero = numero;
        this.kuvanTunnus = tunnus;
    }
    
    /**
     *
     * @return
     * @throws FileNotFoundException
     */
    public File haeTeksti() throws FileNotFoundException {
        File teksti = new File("src/visualnovel/ikkunat/tekstit/"+sivunumero+".txt");
        
        return teksti;
    }
    
    /**
     *
     * @return
     */
    public BufferedImage haeKuva() {
        
        BufferedImage kuva = null;
        try {
           kuva = ImageIO.read(new File("src/visualnovel/ikkunat/kuvat/"+kuvanTunnus+".jpg")); 
        } catch (Exception e){
            System.out.println("Kuvaa ei löytynyt");
            e.printStackTrace();
        }
        
        
        return kuva;
    }

    /**
     * 
     * @return Metodi palauttaa listan String-olioita, jotka sijoitetaan toisessa luokassa nappien teksteiksi. 
     */
    public abstract ArrayList<String> seuraavat(); //Minne seuraavaksi voidaan siirtyä
    
    /**
     *
     * @return
     */
    public int getSivunumero() {
        return sivunumero;
    }

    /**
     *
     * @return
     */
    public String getKuvanTunnus() {
        return kuvanTunnus;
    }

}
