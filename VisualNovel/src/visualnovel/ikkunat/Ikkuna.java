
package visualnovel.ikkunat;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

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
    
    public BufferedImage haeKuva() throws IOException {
        
        BufferedImage kuva;
        kuva = ImageIO.read(new File("src/visualnovel/ikkunat/kuvat/"+kuvanTunnus+".txt"));
        
        return kuva;
    }
    
    public abstract void seuraava(); //Minne seuraavaksi voidaan siirtyä

}
