/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualnovel.ikkunat;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author maef
 */
public class Ikkuna4Test {
    
    public Ikkuna4Test() {
    }

    Ikkuna4 ikkuna;
    
    @Before
    public void setUp() {
        ikkuna = new Ikkuna4();
    }

        @Test
    public void sivunumerotAsettuvatOikein(){
       int exp = 4;
       assertEquals(exp, ikkuna.getSivunumero());
    }
    
    @Test
    public void kuvatunnuksetAsettuvatOikein(){
       String exp = "4";
       assertEquals(exp, ikkuna.getKuvanTunnus());
    }
    
    @Test
    public void tekstilistanSisaltoOnHaluttu() {
        
        String exp1 = "Aloita alusta";
        
        assertEquals(exp1, ikkuna.seuraavat().get(0));
    }
}
