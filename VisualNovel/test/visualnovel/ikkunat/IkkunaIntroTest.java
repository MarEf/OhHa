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
public class IkkunaIntroTest {
    
    public IkkunaIntroTest() {
    }

    IkkunaIntro ikkuna;
    
    @Before
    public void setUp() {
        ikkuna = new IkkunaIntro();
    }

        @Test
    public void sivunumerotAsettuvatOikein(){
       int exp = 0;
       assertEquals(exp, ikkuna.getSivunumero());
    }
    
    @Test
    public void kuvatunnuksetAsettuvatOikein(){
       String exp = "intro";
       assertEquals(exp, ikkuna.getKuvanTunnus());
    }
    
    @Test
    public void tekstilistanSisaltoOnHaluttu() {
        
        String exp1 = "Aloita";
        
        assertEquals(exp1, ikkuna.seuraavat().get(0));
    }
}
