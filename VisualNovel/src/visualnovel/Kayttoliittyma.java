
package visualnovel;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        frame.setPreferredSize(new Dimension(1000, 800));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        try {
            luoKomponentit(frame.getContentPane());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Kayttoliittyma.class.getName()).log(Level.SEVERE, null, ex);
        }

        frame.pack();
        frame.setVisible(true);
        
    }
    
    private void luoKomponentit(Container container) throws FileNotFoundException {
        JPanel kuva = new JPanel();
        kuva.setSize(1000, 500);
        kuva.setBackground(Color.gray);
        container.add(kuva);
        
        JPanel teksti = new JPanel();
        teksti.setSize(1000, 300);
        teksti.setBackground(Color.white);
        container.add(teksti);
    }
    
    public JFrame getFrame() {
        return frame;
    }


    
}
