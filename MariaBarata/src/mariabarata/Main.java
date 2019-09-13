package mariabarata;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame{
    
    boolean clicado = false;
    ImageIcon bv = new ImageIcon(getClass().getResource("barata.gif"));
    ImageIcon bm = new ImageIcon(getClass().getResource("barata.png"));
    
    JLabel b = new JLabel(bv);
    JLabel a = new JLabel("0");
    
    int cont = 0;
    
    public void Posições(){
        int x = (int) (Math.random()*650);
        int y = (int) (Math.random()*500);
        
        b.setIcon(bv);
        b.setBounds(x,y,150,84);
        
        
    }
    
    
    public class Barata extends Thread{
        public void run(){
            
            while(true){
                try {sleep(2000);} catch (Exception e) {}
                Posições();
            }
        }
    }
    
    public Main(){
        setTitle("Mata Barata");
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(this);
        setLayout(null);
        
        Barata ba = new Barata();
        ba.start();
        
        a.setBounds(10,10,50,50);
        
        add(a);
        add(b);
        
        Posições();
        b.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
                b.setIcon(bm);
                try {sleep(100);} catch (Exception e) {}
                cont++;
                a.setText(""+cont);
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
    }
    
    public static void main(String[] args) {
        new Main();
    }    
}