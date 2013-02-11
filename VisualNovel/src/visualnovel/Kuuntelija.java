
package visualnovel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
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
    private JPanel kuva;
    private Selaaja selaaja = new Selaaja(new Ikkunat());
    private boolean goodEnd = false;
    

    public Kuuntelija(JButton nappi1, JButton nappi2, JTextArea tarina, JPanel kuva) {
        this.nappi1 = nappi1;
        this.nappi2 = nappi2;
        this.tarina = tarina;
        this.kuva = kuva;
    }

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

    public void vaihdaIkkunaa() {
        
        Ikkuna ikkuna = selaaja.palautaIkkuna();
        Tekstinkasittelija kasittelija = new Tekstinkasittelija();
        
        try {
        tarina.setText(kasittelija.lueTiedosto(ikkuna.haeTeksti()));
            } catch(Exception e) {
            }
        try {
            BufferedImage lisattava = ikkuna.haeKuva();
            //kuva.prepareImage(lisattava, kuva);
            Graphics g = lisattava.createGraphics();
            kuva.setBackground(Color.white);
            kuva.paint(g);
            
            Graphics2D g2 = (Graphics2D) g;
 
            g2.drawImage(lisattava, null, 0, 0);
            g.setColor(Color.BLACK);
            g.drawRect(10,15, 200, 50);
            kuva.repaint();
           
        } catch (IOException ex) {
            Logger.getLogger(Kuuntelija.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayList<String> seuraavat = ikkuna.seuraavat();
        
        if (seuraavat.size() == 1){
            nappi2.setEnabled(false);
            nappi1.setText(selaaja.palautaIkkuna().seuraavat().get(0));
            nappi2.setText(" ");
        }
        if (seuraavat.size() == 2){
            nappi2.setEnabled(true); //VALMIISSA VERSIOSSA TRUE!!!
            nappi1.setText(selaaja.palautaIkkuna().seuraavat().get(0));
            nappi2.setText(selaaja.palautaIkkuna().seuraavat().get(1));
        }
    }
}
