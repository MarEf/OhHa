
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
    
    public Ikkuna(int numero, String tunnus) {
        this.sivunumero = numero;
        this.kuvanTunnus = tunnus;
    }
    
    public File haeTeksti() throws FileNotFoundException {
        File teksti = new File("src/visualnovel/ikkunat/tekstit/"+sivunumero+".txt");
        
        return teksti;
    }
    
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

    public int getSivunumero() {
        return sivunumero;
    }

    public String getKuvanTunnus() {
        return kuvanTunnus;
    }
    /**
     * 
     * @return Metodi palauttaa listan String-olioita, jotka sijoitetaan toisessa luokassa nappien teksteiksi. 
     */
    public abstract ArrayList<String> seuraavat(); //Minne seuraavaksi voidaan siirtyä

}
