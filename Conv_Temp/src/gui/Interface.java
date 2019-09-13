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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String v = text.getText();
        double V = Double.parseDouble(v);
        
        DecimalFormat d = new DecimalFormat("0.00");
        
        double vconv;
        
        if (radior.isSelected()) {
            vconv = ((V*5)-160)/9;
        }else {
            vconv = ((V*9)+160)/5;
        }
        
        label2.setText("Conv: "+d.format(vconv));
        
    }
    
    JFrame tela =  new JFrame();
    JButton btn1 = new JButton("Converter");
    //JPanel painel = new JPanel();
    
    JTextField text = new JTextField();
    
    JRadioButton radiod = new JRadioButton("C -> F");
    JRadioButton radior = new JRadioButton("F -> C");
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
        radior.setBounds(120,100,150,25);
        radiod.setBounds(120,120,150,25);
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
        
        
    }
    
    public static void main(String[] args) {
        Interface tela = new Interface();
    }

}
