
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
        frame.setPreferredSize(new Dimension(1015, 800));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  
            luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
    }
    
    private void luoKomponentit(Container container) {
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        
        JPanel kuva = new JPanel();
        kuva.setPreferredSize(new Dimension(1000, 500));
        kuva.setBackground(Color.gray);
        container.add(kuva);
        
        JPanel teksti = new JPanel();
        teksti.setPreferredSize(new Dimension(1000, 300));
        teksti.setBackground(Color.DARK_GRAY);
        container.add(teksti);
        
        JTextArea tarina = new JTextArea("");
        tarina.setEditable(false);
        tarina.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        tarina.setPreferredSize(new Dimension(1000, 200));
        tarina.setBackground(Color.white);
        teksti.add(tarina);
        
        JPanel napit = new JPanel();
        napit.setLayout(new BoxLayout(napit, BoxLayout.Y_AXIS));
        teksti.add(napit);
        
        JButton nappi1 = new JButton("Aloita");
        napit.add(nappi1);
        
        JButton nappi2 = new JButton(" ");
        nappi2.setEnabled(false);
        napit.add(nappi2);
        
        Kuuntelija kuuntelija = new Kuuntelija(nappi1, nappi2, tarina);
        
        nappi1.addActionListener(kuuntelija);
        nappi2.addActionListener(kuuntelija);
    }
    
    public JFrame getFrame() {
        return frame;
    }

}
