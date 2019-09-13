package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interface implements ActionListener{
    
//    JFrame tela = new JFrame();
//    JButton btn1 = new JButton("Eu aqui!");
//    JButton btn2 = new JButton("Eu aqui tbm!");
//    JButton btn3 = new JButton("Eu aqui!");
//    JButton btn4 = new JButton("Eu aqui tbm!");
//    JButton btn5 = new JButton("Eu aqui!");
//    JButton btn6 = new JButton("Eu aqui tbm!");
//    btn8 = new JButton("Eu aqui tbm!");
//    
//    JLabel Nome = new JLabel("Juninho");
//    
//    JRadioButton radiom = new JRadioButton("MACHO");
//    JRadioButton radiof = new JRadioButton("FEMEA");
//    
//    JPanel painel = new JPanel();
//    
//    JTextField texto = new JTextField();
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String v = text.getText();
        double V = Double.parseDouble(v);
        
        DecimalFormat d = new DecimalFormat("0.00");
        
        double vconv;
        
        if (radior.isSelected()) {
            vconv = V*3.13;
        }else {
            vconv = V/3.13;
        }
        
        label2.setText("Conv: "+d.format(vconv));
        
    }
    
    JFrame tela =  new JFrame();
    JButton btn1 = new JButton("Converter");
    //JPanel painel = new JPanel();
    
    JTextField text = new JTextField();
    
    JRadioButton radiod = new JRadioButton("Real (R$) -> Dolar ($)");
    JRadioButton radior = new JRadioButton("Dolar ($) -> Real (R$)");
    ButtonGroup moeda = new ButtonGroup();
    
    JLabel label1 = new JLabel("Valor");
    JLabel label2 = new JLabel("Conv: ");
    
    public Interface(){
        
        tela.setTitle("Conversor de Moedas");
        tela.setBackground(Color.white);
        tela.setSize(300, 300);
        tela.setVisible(true);
        tela.setLocationRelativeTo(tela);
        tela.setResizable(false);
        
        tela.setLayout(null);
        
        btn1.setBounds(90,200,120,30);
        btn1.setFont(new Font(null, Font.BOLD,12));
        text.setBounds(90,40,120,30);
        label1.setBounds(130,5,50,25);
        radior.setBounds(80,100,150,25);
        radiod.setBounds(80,120,150,25);
        label2.setBounds(110,150,120,30);
        
        tela.add(btn1);
        tela.add(label1);
        tela.add(text);
        tela.add(radiod);
        tela.add(radior);
        tela.add(label2);
        
        btn1.addActionListener(this);
        
        moeda.add(radior);
        moeda.add(radiod);
        
//        tela.setTitle("GUI");
//        tela.setBackground(Color.blue);
//        tela.setSize(800, 600);
//        tela.setVisible(true);
//        tela.setLocationRelativeTo(tela);
//        tela.setResizable(false);
//        
//        painel.setSize(500, 400);
//        painel.setBackground(Color.red);
//        painel.setLayout(new FlowLayout(1,10,10));
//        painel.add(btn1);
//        painel.add(btn2);
//        
//        texto.setLayout(null);
//        
//        texto.setBounds(5,5,200,25);
//        
//        tela.setLayout(new FlowLayout(1, 10, 10));
//        //tela.setLayout(new BorderLayout());
//        //tela.setLayout(new GridLayout(5,2));
//                
//                
//        //btn2.setBackground(Color.red);
//        btn2.setForeground(Color.black);
//        
//        tela.add(painel);
//        
//        tela.add(texto);
//        
//        tela.add(Nome);
//        
//        tela.add(radiom);
//        tela.add(radiof);
//        
//        //tela.add(btn1);
//        //tela.add(btn2);
//        tela.add(btn3);
//        tela.add(btn4);
//        tela.add(btn5);
//        tela.add(btn6);
//        tela.add(btn7);
//        tela.add(btn8);
        
        
    }
    
    public static void main(String[] args) {
        Interface tela = new Interface();
    }

}
