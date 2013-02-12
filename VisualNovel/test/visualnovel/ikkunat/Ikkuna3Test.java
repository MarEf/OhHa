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
public class Ikkuna3Test {
    
    public Ikkuna3Test() {
    }

    Ikkuna3 ikkuna;
    
    @Before
    public void setUp() {
        ikkuna = new Ikkuna3();
    }

        @Test
    public void sivunumerotAsettuvatOikein(){
       int exp = 3;
       assertEquals(exp, ikkuna.getSivunumero());
    }
    
    @Test
    public void kuvatunnuksetAsettuvatOikein(){
       String exp = "3";
       assertEquals(exp, ikkuna.getKuvanTunnus());
    }
    
    @Test
    public void tekstilistanSisaltoOnHaluttu() {
        
        String exp1 = ">>";
        
        assertEquals(exp1, ikkuna.seuraavat().get(0));
    }
}
