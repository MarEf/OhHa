
package visualnovel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import visualnovel.ikkunat.*;

/**
 *
 * @author maef
 */
public class Kuuntelija implements ActionListener{
    
    private JButton nappi1;
    private JButton nappi2;
    private JTextArea tarina;
    private Selaaja selaaja = new Selaaja(new Ikkunat());
    private boolean goodEnd = false;
    

    public Kuuntelija(JButton nappi1, JButton nappi2, JTextArea tarina) {
        this.nappi1 = nappi1;
        this.nappi2 = nappi2;
        this.tarina = tarina;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nappi1){
            if (goodEnd == false) {
                selaaja.setJ(selaaja.getJ()+1);
            }
            if (goodEnd == true) {
                selaaja.setI(selaaja.getI()+1);
            }
        }
        if (e.getSource() == nappi2) {
            if (goodEnd == false) {
                goodEnd = true;
                selaaja.setI(selaaja.getI()+1);
            }
            if (goodEnd == true) {
                goodEnd = false;
                selaaja.setJ(selaaja.getJ()+1);
            }
        }
        
        vaihdaIkkunaa();

    }

    public void vaihdaIkkunaa() {
        
        Ikkuna ikkuna = selaaja.palautaIkkuna();
        Tekstinkasittelija kasittelija = new Tekstinkasittelija();
        
        try {
        tarina.setText(kasittelija.lueTiedosto(ikkuna.haeTeksti()));
            } catch(Exception e) {
            }
        
        ArrayList<String> seuraavat = ikkuna.seuraavat();
        
        if (seuraavat.size() == 1){
            nappi2.setEnabled(false);
            nappi1.setText(selaaja.palautaIkkuna().seuraavat().get(0));
            nappi2.setText(" ");
        }
        if (seuraavat.size() == 2){
            nappi2.setEnabled(false); //VALMIISSA VERSIOSSA TRUE!!!
            nappi1.setText(selaaja.palautaIkkuna().seuraavat().get(0));
            nappi2.setText(selaaja.palautaIkkuna().seuraavat().get(1));
        }
    }
}
