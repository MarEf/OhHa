/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualnovel;

import java.io.File;
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
public class TekstinkasittelijaTest {
    
    public TekstinkasittelijaTest() {
    }

    /**
     * Test of lueTiedosto method, of class Tekstinkasittelija.
     */
    @Test
    public void lukeeHaetunTiedoston() throws Exception {
        File tiedosto = new File("src/visualnovel/ikkunat/tekstit/testi.txt");
        Tekstinkasittelija instance = new Tekstinkasittelija();
        String expResult = "Tämä lause on\n"
                + "valhe\n";
        String result = instance.lueTiedosto(tiedosto);
        assertEquals(expResult, result);
    }
}
