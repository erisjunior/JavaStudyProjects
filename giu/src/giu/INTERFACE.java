
package giu;

import com.sun.prism.paint.Gradient;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class INTERFACE {
        
        JFrame tela =  new JFrame();
        JPanel painel = new JPanel();
        JTextField visor = new JTextField();
        JButton btn1 = new JButton("01");
        JButton btn2 = new JButton("02");
        JButton btn3 = new JButton("03");
        JButton btn4 = new JButton("04");
        JButton btn5 = new JButton("05");
        JButton btn6 = new JButton("06");
        JButton btn7 = new JButton("07");
        JButton btn8 = new JButton("08");
        JButton btn9 = new JButton("09");
        JButton btn10 = new JButton("*");
        JButton btn11 = new JButton("0");
        JButton btn12 = new JButton("#"); 
        
        JTextField text = new JTextField();
        //JFrame tela =  new JFrame(); 1
        //JButton btn1 = new JButton("Butão"); 1
        //JPanel painel = new JPanel(); 1
        
        
        
        public INTERFACE(){
            tela.setTitle("Samsung");
            tela.setSize(600, 600);
            tela.setVisible(true);
            tela.setLocationRelativeTo(tela);
            tela.setResizable(false);
            tela.setLocation(300, 50);
            
            //tela.setSize(400, 400); 1
            //tela.setVisible(true); 1
            //tela.setLayout(null); 1
            
            //painel.setLayout(new GridLayout(2,1)); 1
            //btn1.setBounds(0,0,250,250);
            
            //tela.add(painel); 1
            //painel.add(btn1); 1
            
            painel.setLayout(new GridLayout(4,3));
            tela.setLayout(new GridLayout(2,1));
            
            tela.add(text);
            tela.add(painel);
            painel.add(btn1);
            painel.add(btn2);
            painel.add(btn3);
            painel.add(btn4);
            painel.add(btn5);
            painel.add(btn6);
            painel.add(btn7);
            painel.add(btn8);
            painel.add(btn9);
            painel.add(btn10);
            painel.add(btn11);
            painel.add(btn12);
        }    
    
    public static void main(String[] args){
            INTERFACE tela = new INTERFACE();
            
        }
    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
