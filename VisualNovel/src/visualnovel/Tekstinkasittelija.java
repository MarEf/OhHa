
package visualnovel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author maef
 */
public class Tekstinkasittelija {
    
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