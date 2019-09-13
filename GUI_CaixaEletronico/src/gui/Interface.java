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
import static java.time.Clock.system;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
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
        
        int valor = Integer.parseInt(text.getText());
       
        c1.Sacar(valor);
       
        if(c1.getA()){
            int Q100 = valor/100;
            int Q50 =(valor - (Q100*100))/50;
            int Q20 = (valor - ((Q100*100)+(Q50*50)))/20;
            int Q10 = (valor - ((Q100*100)+(Q50*50)+(Q20*20)))/10;
            int Q5 =  (valor - ((Q100*100)+(Q50*50)+(Q20*20)+(Q10*10)))/5;

            label4.setText(""+c1.getSaldo());

            ll100.setText(""+Q100);
            ll50.setText(""+Q50);
            ll20.setText(""+Q20);
            ll10.setText(""+Q10);
            ll5.setText(""+Q5);
        } else{
            ll100.setText("");
            ll50.setText("");
            ll20.setText("");
            ll10.setText("");
            ll5.setText("");
        }
        
    }
    
    Conta c1 = new Conta(1,"1",1400);
    Conta c2 = new Conta(2,"2",1400);
    Conta c3 = new Conta(3,"3",1400);
    
    
    public void Acesso(){
        
        label2.setText(""+c1.getConta());
        
        label4.setText(""+c1.getSaldo());
        
        int conta = Integer.parseInt(JOptionPane.showInputDialog("CONTA: "));
        String senha = JOptionPane.showInputDialog("SENHA: ");
        
        if(conta == c1.getConta() && senha.equals(c1.getSenha())){
            JOptionPane.showMessageDialog(null,"Acessando Conta");
        } else {
            System.exit(0);
        }
    }
    
    JFrame tela =  new JFrame();
    JButton btn1 = new JButton("Converter");
    
    JPanel painel1 = new JPanel();
    JPanel painel2 = new JPanel();
    JPanel painel3 = new JPanel();
    JPanel painel4 = new JPanel();
    JPanel painel5 = new JPanel();
    JPanel painel6 = new JPanel();
    
    JTextField text = new JTextField();
    
    JLabel label1 = new JLabel("Conta: ");
    JLabel label2 = new JLabel("");
    JLabel label3 = new JLabel("Saldo: ");
    JLabel label4 = new JLabel("");
    JLabel label5 = new JLabel("Valor:");
    
    JLabel l5 = new JLabel("");
    JLabel l10 = new JLabel("");
    JLabel l20 = new JLabel("");
    JLabel l50 = new JLabel("");
    JLabel l100 = new JLabel("");
    JLabel ll5 = new JLabel("0");
    JLabel ll10 = new JLabel("0");
    JLabel ll20 = new JLabel("0");
    JLabel ll50 = new JLabel("0");
    JLabel ll100 = new JLabel("0");
    
    
    public Interface(){
        
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setTitle("Conversor de Moedas");
        tela.setBackground(Color.white);
        tela.setSize(700, 700);
        tela.setVisible(true);
        tela.setLocationRelativeTo(tela);
        tela.setResizable(false);
        Acesso();
        
        tela.setLayout(null);
        
        
        painel1.setLayout(new GridLayout(1,4));
        painel1.setBounds(140,10,400,20);
        painel1.add(label1);
        painel1.add(label2);
        painel1.add(label3);
        painel1.add(label4);
        tela.add(painel1);
        
        painel2.setLayout(new GridLayout(1,3));
        painel2.setBounds(200,50,270,20);
        btn1.addActionListener(this);
        painel2.add(label5);
        painel2.add(text);
        painel2.add(btn1);
        tela.add(painel2);
        
        l5.setBounds(0,80,170,100);
        l5.setIcon(new ImageIcon("C:/5Reais.jpg"));
        l5.setSize(170,100);
        tela.add(l5);
        
        l10.setBounds(300,80,200,100);
        l10.setIcon(new ImageIcon("C:/10Reais.jpg"));
        l10.setSize(170,100);
        tela.add(l10);
        
        l20.setBounds(500,80,200,100);
        l20.setIcon(new ImageIcon("C:/20Reais.jpg"));
        l20.setSize(170,100);
        tela.add(l20);
        
        l50.setBounds(200,150,200,100);
        l50.setIcon(new ImageIcon("C:/50Reais.jpg"));
        l50.setSize(170,100);
        tela.add(l50);
        
        painel3.setBounds(400,150,200,100);
        l100.setIcon(new ImageIcon("C:/100Reais.jpg"));
        l100.setSize(170,100);
        painel3.add(l100);
        tela.add(painel3);

    }
    
    public static void main(String[] args) {
        Interface tela = new Interface();
    }

}
