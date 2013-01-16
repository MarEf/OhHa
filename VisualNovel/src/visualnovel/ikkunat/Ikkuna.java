
package visualnovel.ikkunat;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author maef
 */
public class Ikkuna {

    private int sivunumero = 0;
    
    public Ikkuna() {
    }
    
    public void haeTeksti() throws FileNotFoundException {
        File teksti = new File("src/visualnovel/ikkunat/"+sivunumero+".txt");
        try (Scanner lukija = new Scanner(teksti)) {
            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
                System.out.println(rivi);
            } 
            lukija.close();
            
        } catch (Exception e) {
            System.out.println("Hups... Tekstiä ei löytynyt.");
        }
    }
    
    public void haeKuva() {
        //Tämä ei tee toistaiseksi vielä mitään.
        //Graafisessa käyttöliittymässä tämä hakee tekstiin sopivan kuvan
        //ja asettaa sen taustalle.
    }
    
    public void jatka() {
        //Käynnistää pelaajan valinnan perusteella seuraavan ikkunan.
        
    }

    public void setSivunumero(int sivunumero) {
        this.sivunumero = sivunumero;
    }
}
