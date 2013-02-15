
package visualnovel.ikkunat;

/**
 * Säilöö kaikki Ikkuna-luokan toteuttavat oliot taulukkoon omille paikoilleen.
 * 
 * @author maef
 */
public class Ikkunat {
    private Ikkuna[][] ikkunat = new Ikkuna[6][5];

    /**
     *
     */
    public Ikkunat() {
        lisaaIkkunat();
    }

    /**
     *
     * @return palauttaa taulukon, joka sisältää Ikkuna-olioita
     */
    public Ikkuna[][] getIkkunat() {
        return ikkunat;
    }
    
    /**
     * Metodi lisää ikkunat taulukkoon.
     */
    private void lisaaIkkunat() {
        ikkunat[0][0] = new Ikkuna(0, "intro");
        ikkunat[0][1] = new Ikkuna(1, "1");
        ikkunat[0][2] = new Ikkuna(2, "2");
        ikkunat[0][3] = new Ikkuna(3, "3");
        ikkunat[0][4] = new Ikkuna(4, "4");
        ikkunat[1][1] = new Ikkuna(5, "5");
        ikkunat[2][1] = new Ikkuna(6, "6");
        ikkunat[3][1] = new Ikkuna(7, "7");
        ikkunat[4][1] = new Ikkuna(8, "8");
        ikkunat[5][1] = new Ikkuna(9, "9");
        ikkunat[1][2] = new Ikkuna(10, "10");
        ikkunat[1][3] = new Ikkuna(11, "11");
        
    }
}
