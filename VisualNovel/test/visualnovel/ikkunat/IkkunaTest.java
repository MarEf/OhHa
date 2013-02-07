
package visualnovel.ikkunat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maef
 */
public class IkkunaTest {
    
    public IkkunaTest() {
    }

    

    @Test
    public void eiLataaTiedostoaJotaEiOle(){
        Ikkuna ikkuna = new TestiIkkuna();
        File tiedosto;
        try {
            tiedosto = ikkuna.haeTeksti();
        } catch (FileNotFoundException ex) {
            tiedosto = null;
        }
        
        assertEquals(null, tiedosto);
    }
}
