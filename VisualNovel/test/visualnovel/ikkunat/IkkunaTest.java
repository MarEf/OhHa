
package visualnovel.ikkunat;

import java.awt.image.BufferedImage;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author maef
 */
public class IkkunaTest {
    
    public IkkunaTest() {
    }

    Ikkuna ikkuna;
    
    @Before
    public void setUp() {
        ikkuna = new Ikkuna(1, "1");
    }
    
    @Test
    public void eiLataaKuvaaJotaEiOle(){
        Ikkuna testiIkkuna = new TestiIkkuna();
        BufferedImage kuva;
        try {
            kuva = testiIkkuna.haeKuva();
        } catch (Exception e) {
            kuva = null;
        }
        
        assertEquals(null, kuva);
    }
    
 @Test
    public void sivunumerotAsettuvatOikein(){
       int exp = 1;
       assertEquals(exp, ikkuna.getSivunumero());
    }
    
    @Test
    public void kuvatunnuksetAsettuvatOikein(){
       String exp = "1";
       assertEquals(exp, ikkuna.getKuvanTunnus());
    }
    
    @Test
    public void tekstilistanSisaltoOnHaluttu() {
        
        String exp1 = "1. Minä: \"Itseasiassa äiti käski mennä suoraan kotiin. Ehkä huomenna.\" (Vilkutus)";
        String exp2 = "2. Minä: Äiti käski mennä suoraan kotiin, mutta... \"Kuulostaa hyvältä! Mennään.\"";
        
        assertEquals(exp1, ikkuna.seuraavat().get(0));
        assertEquals(exp2, ikkuna.seuraavat().get(1));
        
    }
}
