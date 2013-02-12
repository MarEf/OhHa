
package visualnovel.ikkunat;

import java.awt.image.BufferedImage;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author maef
 */
public class IkkunaTest {
    
    public IkkunaTest() {
    }

    @Test
    public void eiLataaKuvaaJotaEiOle(){
        Ikkuna ikkuna = new TestiIkkuna();
        BufferedImage kuva;
        try {
            kuva = ikkuna.haeKuva();
        } catch (Exception e) {
            kuva = null;
        }
        
        assertEquals(null, kuva);
    }
    

}
