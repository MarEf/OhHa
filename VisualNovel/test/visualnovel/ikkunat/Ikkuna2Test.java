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
public class Ikkuna2Test {
    
    public Ikkuna2Test() {
    }
    
    Ikkuna2 ikkuna;
    
    @Before
    public void setUp() {
        ikkuna = new Ikkuna2();
    }

        @Test
    public void sivunumerotAsettuvatOikein(){
       int exp = 2;
       assertEquals(exp, ikkuna.getSivunumero());
    }
    
    @Test
    public void kuvatunnuksetAsettuvatOikein(){
       String exp = "2";
       assertEquals(exp, ikkuna.getKuvanTunnus());
    }
    
    @Test
    public void tekstilistanSisaltoOnHaluttu() {
        
        String exp1 = ">>";
        
        assertEquals(exp1, ikkuna.seuraavat().get(0));
    }
}
