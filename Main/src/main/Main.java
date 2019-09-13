
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == seq){
           new Sequencial();
       } else if(e.getSource() == cond){
           new Condicional();
       } else if(e.getSource() == loop){
           
       }
    }
    JButton seq = new JButton("Sequênciais");
    JButton cond = new JButton("Condiçionais");
    JButton loop = new JButton("Loop's");
    
    JLabel nome = new JLabel("Nome: Toinho Juninho");
    JLabel turma = new JLabel("Turma: 2º D");
    
    public Main(){
        setSize(220,300);
        setLocationRelativeTo(this);
        setTitle("Exercicios");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        seq.setBounds(10,10,185,30);
        cond.setBounds(10,45,185,30);
        loop.setBounds(10,80,185,30);
        
        nome.setBounds(25,140,180,30);
        turma.setBounds(20,165,180,30);
        
        add(seq);
        add(cond);
        add(loop);
        
        add(nome);
        add(turma);
        
        seq.addActionListener(this);
        loop.addActionListener(this);
        cond.addActionListener(this);
    }
    public static void main(String[] args) {
       new Main();
    }

   

   
}
