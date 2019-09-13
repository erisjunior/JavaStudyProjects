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
    
    int jp=0;
    int pg=0;
    int cg=0;
    int i=0;
    String nome="";
    int vezes=0;
    int cont=0;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            cont++;
        
            int num = (int) (Math.random()*3+1);

            if(lpedra.isSelected()) {
                jp=1;
            }else if(lpapel.isSelected()) {
                jp=2;
            }else if(ltesoura.isSelected()) {
                jp=3;
            };



            if(jp==1 && num==3){
                pg = Integer.parseInt(jog.getText());
                pg = pg+1;
                jog.setText(""+pg);
                lresult.setText(nome+" GANHOU");
                jogadap.setText(nome+": PEDRA");
                jogadacpu.setText("CPU: TESOURA");
                }
            else if(jp==2 && num==1){
                pg = Integer.parseInt(jog.getText());
                pg = pg+1;
                jog.setText(""+pg);
                lresult.setText(nome+" GANHOU");
                jogadap.setText(nome+": PAPEL");
                jogadacpu.setText("CPU: PEDRA");
                }
            else if(jp==3 && num==2){
                pg = Integer.parseInt(jog.getText());
                pg = pg+1;
                jog.setText(""+pg);
                lresult.setText(nome+" GANHOU");
                jogadap.setText(nome+": TESOURA");
                jogadacpu.setText("CPU: PAPEL");
                }
            else if(jp==1 && num==2){
                cg = Integer.parseInt(cpu.getText());
                cg = cg+1;
                cpu.setText(""+cg);
                lresult.setText("CPU GANHOU");
                jogadap.setText(nome+": PEDRA");
                jogadacpu.setText("CPU: PAPEL");
                }
            else if(jp==2 && num==3){
                cg = Integer.parseInt(cpu.getText());
                cg = cg+1;
                cpu.setText(""+cg);
                lresult.setText("CPU GANHOU");
                jogadap.setText(nome+": PAPEL");
                jogadacpu.setText("CPU: TESOURA");
                }
            else if(jp==3 && num==1){
                cg = Integer.parseInt(cpu.getText());
                cg = cg+1;
                cpu.setText(""+cg);
                lresult.setText("CPU GANHOU");
                jogadap.setText(nome+": TESOURA");
                jogadacpu.setText("CPU: PEDRA");
                }
            else if(jp==1 && num==1){
                i = Integer.parseInt(emp.getText());
                i = i+1;
                emp.setText(""+i);
                lresult.setText("EMPATE");
                jogadap.setText(nome+": PEDRA");
                jogadacpu.setText("CPU: PEDRA");
                }
            else if(jp==2 && num==2){
                i = Integer.parseInt(emp.getText());
                i = i+1;
                emp.setText(""+i);
                lresult.setText("EMPATE");
                jogadap.setText(nome+": PAPEL");
                jogadacpu.setText("CPU: PAPEL");
                }
                else if(jp==3 && num==3){
                i = Integer.parseInt(emp.getText());
                i = i+1;
                emp.setText(""+i);
                lresult.setText("EMPATE");
                jogadap.setText(nome+": TESOURA");
                jogadacpu.setText("CPU: TESOURA");
                }

            if (cont==vezes) {
                JOptionPane.showMessageDialog(null,"Vitorias "+nome+": "+pg+" \n Vitorias CPU: "+cg+" \n Empates: "+i);
                    if (cg>pg) {
                        JOptionPane.showMessageDialog(null,"CPU GANHOU, SEU AZARADO");
                    }
                    if (pg>cg) {
                        JOptionPane.showMessageDialog(null,"PARABÉNS "+nome+", VOCÊ GANHOU");
                    }
                    if (pg==cg) {
                        JOptionPane.showMessageDialog(null,"DEU EMPATE");
                    }
                System.exit(0);
            }
        } else if(e.getSource()==btn2){
            nome = JOptionPane.showInputDialog("Entre com seu nome");
            vezes = Integer.parseInt(JOptionPane.showInputDialog("Quantas rodadas?"));
            lplayer.setText(nome);
            emp.setText("0");
            cpu.setText("0");
            jog.setText("0"); 
            lresult.setText("");
            jogadap.setText("");
            jogadacpu.setText("");
        }
        
    }
    
    JFrame tela =  new JFrame();
    JButton btn1 = new JButton("Jogar");
    JButton btn2 = new JButton("Config");
    JPanel painel1 = new JPanel();
    JPanel painel2 = new JPanel();
    JPanel painel3 = new JPanel();
    
    JLabel ljokenpo = new JLabel("JOKENPO");
    JLabel lplayer = new JLabel("PLAYER");
    JLabel lcpu = new JLabel("CPU");
    JLabel lempate = new JLabel("EMPATE");
    JLabel jog = new JLabel("0");
    JLabel cpu = new JLabel("0");
    JLabel emp = new JLabel("0");
    JLabel jogadap = new JLabel("");
    JLabel jogadacpu = new JLabel("");
    JLabel lresult = new JLabel("");
    
    JRadioButton lpapel = new JRadioButton("PAPEL");
    JRadioButton lpedra = new JRadioButton("PEDRA");
    JRadioButton ltesoura = new JRadioButton("TESOURA");
    ButtonGroup escolha = new ButtonGroup();
    
    public Interface(){
        
        tela.setTitle("Jokenpo");
        tela.setBackground(Color.white);
        tela.setSize(500, 500);
        tela.setVisible(true);
        tela.setLocationRelativeTo(tela);
        tela.setResizable(false);
        
        tela.setLayout(null);
        
        
        ljokenpo.setBounds(200,5,100,25);
        
        
        painel1.setLayout(new GridLayout(1,3));
        painel1.setBounds(25,150,300,100);
        lpedra.setIcon(new ImageIcon("C:/pedra.jpg"));
        lpapel.setIcon(new ImageIcon("C:/papel.jpg"));
        ltesoura.setIcon(new ImageIcon("C:/tesoura.jpg"));
        
        painel1.add(lpedra);
        painel1.add(lpapel);
        painel1.add(ltesoura);
        escolha.add(lpedra);
        escolha.add(lpapel);
        escolha.add(ltesoura);
        tela.add(painel1);
        
        
        painel2.setLayout(new GridLayout(2,3));
        painel2.setBounds(75,50,300,100);
        
        painel2.add(lplayer);
        painel2.add(lcpu);
        painel2.add(lempate);
        painel2.add(jog);
        painel2.add(cpu);
        painel2.add(emp);
        tela.add(painel2);
        
        
        painel3.setLayout(new GridLayout(1,3));
        painel3.setBounds(75,260,300,100);
        
        painel3.add(jogadap);
        painel3.add(lresult);
        painel3.add(jogadacpu);
        
        tela.add(painel3);
        
        
        btn1.setBounds(200,400,100,30);
        btn1.setFont(new Font(null, Font.BOLD,12));
        btn2.setBounds(350,400,100,30);
        btn2.setFont(new Font(null, Font.BOLD,12));
        
        tela.add(btn1);
        tela.add(btn2);
        tela.add(ljokenpo);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }
    
    public static void main(String[] args) {
        Interface tela = new Interface();
    }

}
