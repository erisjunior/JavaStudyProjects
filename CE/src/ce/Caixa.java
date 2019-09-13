package ce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Caixa implements ActionListener {
    int Q100 = 0;
    int Q50 = 0;
    int Q20 = 0;
    int Q10 = 0;
    int Q5 = 0;
    
    @Override
    public void actionPerformed(ActionEvent e){
    int valor = Integer.parseInt(quero.getText());
    Q100 = valor/100;
    Q50 = (valor - (Q100*100))/50;
    Q20 = (valor - ((Q100*100)+(Q50*50)))/20;
    Q10 = (valor - ((Q100*100)+(Q50*50)+(Q20*20)))/10;
    Q5 = (valor - ((Q100*100)+(Q50*50)+(Q20*20)+(Q10*10)))/5;
    
    cincov.setText(""+Q5);
    dezv.setText(""+Q10);
    vintev.setText(""+Q20);
    cinquentav.setText(""+Q50);
    cemv.setText(""+Q100);
    
    } 
    
    JFrame tela = new JFrame();
    JTextField quero = new JTextField();
    JTextField cincov = new JTextField();
    JTextField dezv = new JTextField();
    JTextField vintev = new JTextField();
    JTextField cinquentav = new JTextField();
    JTextField cemv = new JTextField();
    JRadioButton cinco = new JRadioButton();
    JRadioButton dez = new JRadioButton();
    JRadioButton vinte= new JRadioButton();
    JRadioButton cinquenta = new JRadioButton();
    JRadioButton cem = new JRadioButton();
    JButton sacar = new JButton("Sacar");
    
    
    public Caixa(){
        tela.setVisible(true);
        tela.setSize(750,440);
        tela.setLocation(270,130);
        tela.setResizable(false);
        tela.setLayout(null);
        tela.setTitle("Caixa Eletrônico");
        tela.add(quero);
        tela.add(cinco);
        tela.add(dez);
        tela.add(vinte);
        tela.add(cinquenta);
        tela.add(cem);
        tela.add(cincov);
        tela.add(dezv);
        tela.add(vintev);
        tela.add(cinquentav);
        tela.add(cemv);
        tela.add(sacar);
        
        quero.setBounds(230,30,200,30);
        sacar.setBounds(435,30,80,30);
        cinco.setIcon(new ImageIcon("C:/5Reais.jpg"));
        cinco.setBounds(80,100,200,90);
        cincov.setBounds(125,190,80,30);
        dez.setIcon(new ImageIcon("C:/10Reais.jpg"));
        dez.setBounds(280,100,200,90);
        dezv.setBounds(330,190,80,30);
        vinte.setBounds(490,100,200,90);
        vinte.setIcon(new ImageIcon("C:/20Reais.jpg"));
        vintev.setBounds(545,190,80,30);
        cinquenta.setBounds(160,250,200,90);
        cinquenta.setIcon(new ImageIcon("C:/50Reais.jpg"));
        cinquentav.setBounds(220,343,80,30);
        cem.setBounds(390,250,200,90);
        cem.setIcon(new ImageIcon("C:/100Reais.jpg"));
        cemv.setBounds(455,343,80,30);
        sacar.addActionListener(this);
        
}
    public static void main(String[] args) {
        Caixa c = new Caixa();
    }
    
}
