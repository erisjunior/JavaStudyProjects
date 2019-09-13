package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class atividade {
    JFrame tela =  new JFrame();
    JButton btn1 = new JButton("Converter");
    JPanel painel = new JPanel();
    
    JTextField text = new JTextField();
    
    JRadioButton radiod = new JRadioButton("Dolar ($)");
    JRadioButton radior = new JRadioButton("Real (R$)");
    ButtonGroup moeda = new ButtonGroup();
    
    JLabel label1 = new JLabel("Valor");
    JLabel label2 = new JLabel("Conv: ");
    
    public atividade(){
        tela.setTitle("Conversor de Moedas");
        tela.setBackground(Color.white);
        tela.setSize(300, 200);
        tela.setVisible(true);
        tela.setLocationRelativeTo(tela);
        tela.setResizable(false);
        
        tela.add(btn1);
        tela.add(painel);
        
        tela.setLayout(null);
                
        btn1.setBounds(50,50,120,30);
        painel.setBounds(0,0,150,150);
        
        radior.setBounds(5,5,150,25);
        radiod.setBounds(5,15,150,25);
        
        tela.add(text);
        
        //painel.add(moeda);
        
        moeda.add(radiod);
        moeda.add(radior);
        
        
    }
    
    public static void main(String[] args) {
        Interface tela = new Interface();
    }
}
