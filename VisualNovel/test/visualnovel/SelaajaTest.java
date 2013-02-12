/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualnovel;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import visualnovel.ikkunat.*;

/**
 *
 * @author maef
 */
public class SelaajaTest {
    
    public SelaajaTest() {
    }
    

    Selaaja selaaja;
            
    @Before
    public void setUp() {
         selaaja = new Selaaja(new Ikkunat());
    }
    
    /**
     * Test of getI method, of class Selaaja.
     */
    @Test
    public void testGetI() {
        int expResult = 0;
        int result = selaaja.getI();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setI method, of class Selaaja.
     */
    @Test
    public void testSetI() {
        int exp = 0;
        selaaja.setI(3);
        
        assertEquals(exp, selaaja.getI());
    }

    /**
     * Test of getJ method, of class Selaaja.
     */
    @Test
    public void testGetJ() {
        int expResult = 0;
        int result = selaaja.getJ();
        assertEquals(expResult, result);
    }

    /**
     * Test of setJ method, of class Selaaja.
     */
    @Test
    public void testSetJ() {
        int exp = 3;
        selaaja.setJ(3);
        
        assertEquals(exp, selaaja.getJ());
    }

    /**
     * Test of palautaIkkuna method, of class Selaaja.
     */
    @Test
    public void testPalautaIkkuna() {
        selaaja.setI(0);
        selaaja.setJ(1);
        
        Ikkuna exp = new Ikkuna1();
        assertEquals(exp.seuraavat(), selaaja.palautaIkkuna().seuraavat());
    }
}
