
package visualnovel;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import visualnovel.ikkunat.*;

/**
 *
 * @author maef
 */
public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    public Kayttoliittyma() {
    }
    
    @Override
    public void run() {
        frame = new JFrame("Visual Novel");
        frame.setPreferredSize(new Dimension(1015, 820));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  
            luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }
    
    private void luoKomponentit(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        
        JPanel kuva = new JPanel();
        kuva.setPreferredSize(new Dimension(1000, 600));
        kuva.setBackground(Color.BLACK);
        container.add(kuva);
        
        JPanel teksti = new JPanel();
        teksti.setPreferredSize(new Dimension(1000, 200));
        teksti.setBackground(Color.LIGHT_GRAY);
        container.add(teksti);
        
        JTextArea tarina = new JTextArea("");
        tarina.setEditable(false);
        tarina.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        tarina.setPreferredSize(new Dimension(1000, 120));
        tarina.setBackground(Color.lightGray);
        teksti.add(tarina);
        
        JPanel napit = new JPanel();
        napit.setLayout(new BoxLayout(napit, BoxLayout.Y_AXIS));
        teksti.add(napit);
        
        JButton nappi1 = new JButton("Aloita");
        napit.add(nappi1);
        
        JButton nappi2 = new JButton(" ");
        nappi2.setEnabled(false);
        napit.add(nappi2);
        
        Kuuntelija kuuntelija = new Kuuntelija(nappi1, nappi2, tarina, kuva);
        
        nappi1.addActionListener(kuuntelija);
        nappi2.addActionListener(kuuntelija);
        kuuntelija.vaihdaIkkunaa();
        frame.repaint();
    }
    
    public JFrame getFrame() {
        return frame;
    }

}
