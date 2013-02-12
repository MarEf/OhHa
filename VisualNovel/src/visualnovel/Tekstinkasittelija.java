
package visualnovel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Palauttaa file-tiedoston sisällön String-oliona.
 * 
 * @author maef
 */
public class Tekstinkasittelija {

    /**
     *
     */
    public Tekstinkasittelija() {
    }
    /**
     * 
     * @param tiedosto
     * @return Palauttaa parametrina annetun tiedoston sisällön String-oliona.
     * @throws FileNotFoundException 
     */
    public String lueTiedosto(File tiedosto) throws FileNotFoundException {
        String teksti = "";

        Scanner lukija = new Scanner(tiedosto);
        while (lukija.hasNextLine()) {
            teksti = teksti + lukija.nextLine() + "\n";
        }

        lukija.close();
        
        return teksti;
    }
}
