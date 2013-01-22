
package visualnovel.ikkunat;

import java.io.File;
import java.io.FileNotFoundException;
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
public class IkkunaTest {
    
    public IkkunaTest() {
    }

    

    @Test(expected = FileNotFoundException.class)
    public void eiLataaTiedostoaJotaEiOle() throws FileNotFoundException{
        TestiIkkuna ikkuna = new TestiIkkuna();
        
        ikkuna.setSivunumero(-100);
    }
}
