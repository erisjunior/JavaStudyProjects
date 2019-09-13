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
   
    String v="";
    double op=0;
    double op2=0;
    double result=0;
    String operador="";
    
    DecimalFormat d = new DecimalFormat ("0.00000000");

    public void Limpar () {
        Painel.setText("");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btn1){
            Painel.setText(Painel.getText()+"1");
        } 
        else if(e.getSource()==btn2){
            Painel.setText(Painel.getText()+"2");
        } 
        else if(e.getSource()==btn3){
            Painel.setText(Painel.getText()+"3");
        }
        else if(e.getSource()==btn4){
            operador="soma";
            op = Double.parseDouble(Painel.getText()); 
            Painel.setText("");
        } 
        else if(e.getSource()==btn5){
            Painel.setText(Painel.getText()+"4");
        } 
        else if(e.getSource()==btn6){
            Painel.setText(Painel.getText()+"5");
        } 
        else if(e.getSource()==btn7){
            Painel.setText(Painel.getText()+"6");
        } 
        else if(e.getSource()==btn8){
            operador="sub";
            op = Double.parseDouble(Painel.getText());
            Painel.setText("");
        } 
        else if(e.getSource()==btn9){
            Painel.setText(Painel.getText()+"7");
        } 
        else if(e.getSource()==btn10){
            Painel.setText(Painel.getText()+"8");
        } 
        else if(e.getSource()==btn11){
            Painel.setText(Painel.getText()+"9");
        } 
        else if(e.getSource()==btn12){
            operador="mult";
            op = Double.parseDouble(Painel.getText()); 
            Painel.setText("");
        } 
        else if(e.getSource()==btn13){
            Painel.setText(Painel.getText()+".");
        } 
        else if(e.getSource()==btn14){
            Painel.setText(Painel.getText()+"0");
        } 
        else if(e.getSource()==btn15){
            op2 = Double.parseDouble(Painel.getText());
        
            if ("div".equals(operador)) {
                result=op/op2;
                Painel.setText(""+result);
            }
            else if ("mult".equals(operador)) {
                result=op*op2;
                Painel.setText(""+result);
            } 
            else if ("sub".equals(operador)) {
                result=op-op2;
                Painel.setText(""+result);
            }
            else if ("soma".equals(operador)) {
                result=(op+op2);
                Painel.setText(""+result);
            }
        } 
        else if(e.getSource()==btn16){
            operador="div";
            op = Double.parseDouble(Painel.getText());
            Painel.setText("");
        } 
        else if(e.getSource()==btn17){
            op = 0;
            op2 = 0;
            result=0;
            operador="";
            Limpar();
        } 
    }
    
    JFrame tela =  new JFrame();
    
    JPanel painel = new JPanel();
    
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("+");
    JButton btn5 = new JButton("4");
    JButton btn6 = new JButton("5");
    JButton btn7 = new JButton("6");
    JButton btn8 = new JButton("-");
    JButton btn9 = new JButton("7");
    JButton btn10 = new JButton("8");
    JButton btn11 = new JButton("9");
    JButton btn12 = new JButton("*");
    JButton btn13 = new JButton(",");
    JButton btn14 = new JButton("0");
    JButton btn15 = new JButton("=");
    JButton btn16 = new JButton("/");
    JButton btn17 = new JButton("CE");
    
    
    JTextField Painel = new JTextField();
    
    public Interface(){
        
        tela.setTitle("Calculadora");
        tela.setBackground(Color.white);
        tela.setSize(300, 395);
        tela.setVisible(true);
        tela.setLocationRelativeTo(tela);
        tela.setResizable(false);
        
        tela.setLayout(null);
        
        Painel.setBounds(10,10,280,40);
        tela.add(Painel);
        
        painel.setLayout(new GridLayout(4, 4));
        painel.setBounds(10,60,280,240);
        
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
        painel.add(btn13);
        painel.add(btn14);
        painel.add(btn15);
        painel.add(btn16);
        
        tela.add(painel);
        
        btn17.setBounds(10,300,280,60);
        tela.add(btn17);
        
        
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        btn17.addActionListener(this);
        
        
    }
    
    public static void main(String[] args) {
        Interface tela = new Interface();
    }

}
