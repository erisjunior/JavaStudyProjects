package main.l;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex2 extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
        int q=1;
        int cont=0;
        int r=Integer.parseInt(text.getText());
        String t=""+r+"!=";
        for(int i=r;i>0;i--){
            
            cont++;
            if(cont==1){
                t+=i;
            }else{
                t += "x"+i;
            }
            q *= i;
        }
        label3.setText(""+q);
        label2.setText(t);
    }
    
    JLabel label = new JLabel("Numero");
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    
    JTextField text = new JTextField();
    
    JButton btn = new JButton("Fatoriar");
    
    public Ex2(){
        setSize(400,400);
        setVisible(true);
        setTitle("Loop - Fatorial");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        label.setBounds(10,10,85,30);
        label2.setBounds(10,70,150,30);
        label3.setBounds(10,100,150,30);
        btn.setBounds(75,45,150,30);
        text.setBounds(10,45,50,30);
        
        add(btn);
        add(label);
        add(label2);
        add(label3);
        add(text);
        
        btn.addActionListener(this);
        text.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyCode()==10){
                    int q=1;
                    int cont=0;
                    int r=Integer.parseInt(text.getText());
                    String t=""+r+"!=";
                    for(int i=r;i>0;i--){

                        cont++;
                        if(cont==1){
                            t+=i;
                        }else{
                            t += "x"+i;
                        }
                        q *= i;
                    }
                    label3.setText(""+q);
                    label2.setText(t);
                }
            
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        });
        
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(ke.getKeyCode()==1){
                    text.setText(text.getText()+"1");
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if(ke.getKeyCode()==1){
                    text.setText(text.getText()+"1");
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        });
    } 
    
    public static void main(String[] args) {
        new Ex2();
    }
}