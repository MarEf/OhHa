package visualnovel;

import java.io.FileNotFoundException;
import javax.swing.SwingUtilities;
import visualnovel.gui.Kayttoliittyma;

/**
 *
 * @author maef
 */
public class VisualNovel {

    /**
     * @param args the command line arguments
     * @throws FileNotFoundException  
     */
    public static void main(String[] args) throws FileNotFoundException {
        Kayttoliittyma kl = new Kayttoliittyma();
        SwingUtilities.invokeLater(kl);
        
        
    }
}
