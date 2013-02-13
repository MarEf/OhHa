/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualnovel.ikkunat;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maef
 */
public class VaihtoehdotTest {
    
    public VaihtoehdotTest() {
    }
    
    Vaihtoehdot testi;
    
    @Before
    public void setUp() {
        testi = new Vaihtoehdot(3);
    }

    /**
     * Test of palautaVaihtoehdot method, of class Vaihtoehdot.
     */
    @Test
    public void testPalautaVaihtoehdot() {
        String exp = ">>";
        
        assertEquals(exp, testi.palautaVaihtoehdot().get(0));
    }
}
