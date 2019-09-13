
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Sequencial extends JFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ex1){
            new main.s.Ex1();
        } else if(e.getSource()==ex2){
            new main.s.Ex2();
        } else if(e.getSource()==ex3){
            new main.s.Ex3();
        } else if(e.getSource()==ex4){
            new main.s.Ex4();
        } else if(e.getSource()==ex5){
            new main.s.Ex5();
        } else if(e.getSource()==ex6){
            new main.s.Ex6();
        }
    }
    
    JButton ex1 = new JButton("Exercicio 1");
    JButton ex2 = new JButton("Exercicio 2");
    JButton ex3 = new JButton("Exercicio 3");
    JButton ex4 = new JButton("Exercicio 4");
    JButton ex5 = new JButton("Exercicio 5");
    JButton ex6 = new JButton("Exercicio 6");
    
    public Sequencial(){
        setSize(400,400);
        setLocationRelativeTo(this);
        setTitle("Sequencial");
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        ex1.setBounds(50,10,200,30);
        ex2.setBounds(50,45,200,30);
        ex3.setBounds(50,80,200,30);
        ex4.setBounds(50,115,200,30);
        ex5.setBounds(50,150,200,30);
        ex6.setBounds(50,185,200,30);
        
        add(ex1);
        add(ex2);
        add(ex3);
        add(ex4);
        add(ex5);
        add(ex6);
        
        ex1.addActionListener(this);
        ex2.addActionListener(this);
        ex3.addActionListener(this);
        ex4.addActionListener(this);
        ex5.addActionListener(this);
        ex6.addActionListener(this);
        
    }
    
}
