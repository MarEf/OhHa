package visualnovel;

import java.io.FileNotFoundException;
import visualnovel.ikkunat.*;

/**
 *
 * @author maef
 */
public class VisualNovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Ikkuna ikkuna = new Ikkuna();
        
        ikkuna.haeTeksti();
        ikkuna.jatka();
    }
}
