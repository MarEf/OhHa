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
public class Ikkuna1Test {
    
    public Ikkuna1Test() {
    }
    Ikkuna1 ikkuna;
    
    @Before
    public void setUp() {
        ikkuna = new Ikkuna1();
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
