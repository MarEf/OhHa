
package visualnovel.gui;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import visualnovel.Selaaja;
import visualnovel.Tekstinkasittelija;
import visualnovel.ikkunat.*;

/**
 *
 * @author maef
 */
public class Kuuntelija implements ActionListener{
    
    private JButton nappi1;
    private JButton nappi2;
    private JTextArea tarina;
    private JLabel kuva;
    private Selaaja selaaja = new Selaaja(new Ikkunat());
    private boolean goodEnd = false;
    

    /**
     *
     * @param nappi1
     * @param nappi2
     * @param tarina
     * @param kuva
     */
    public Kuuntelija(JButton nappi1, JButton nappi2, JTextArea tarina, JLabel kuva) {
        this.nappi1 = nappi1;
        this.nappi2 = nappi2;
        this.tarina = tarina;
        this.kuva = kuva;
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
       if (selaaja.getI()==0 && selaaja.getJ()==0) {
                    goodEnd = false;
                }
       
        if (e.getSource() == nappi1){
            if (goodEnd == false) {
                selaaja.setJ(selaaja.getJ()+1);
            }
            else if (goodEnd == true) {
                
                selaaja.setI(selaaja.getI()+1);
            }
        }
        if (e.getSource() == nappi2) {
            if (goodEnd == false) {
                goodEnd = true;
                selaaja.setI(selaaja.getI()+1);
            }
            else if (goodEnd == true) {
                goodEnd = false;
                selaaja.setJ(selaaja.getJ()+1);
            }
        }
        
        vaihdaIkkunaa();

    }
    
/**
 * Vaihtaa parhaillaan näytettävää ikkunaa.
 */
    public void vaihdaIkkunaa() {
        
        Ikkuna ikkuna = selaaja.palautaIkkuna();
        Tekstinkasittelija kasittelija = new Tekstinkasittelija();
        
        try {
        tarina.setText(kasittelija.lueTiedosto(ikkuna.haeTeksti()));
            } catch(Exception e) {
            }
            Image lisattava = ikkuna.haeKuva();
            
            kuva.setIcon(new ImageIcon(lisattava));
 
        
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
