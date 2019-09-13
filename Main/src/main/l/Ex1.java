package main.l;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex1 extends JFrame implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
        String texto = "";
        int bombs [] = new int [7];
        int n=1;
        
        while (n<7) {
            int nums = (int) (Math.random()*60+1);

            if ((nums != bombs[1]) && (nums != bombs[2]) && (nums != bombs[3]) && (nums != bombs[4]) && (nums != bombs[5]) && (nums != bombs[6])){

                bombs[n] = nums;
                
                n++;    
            }
        }
        Arrays.sort(bombs);
        
        for(int i = 1; i<7;i++){
            if(i>1){
                texto = texto+" - "+bombs[i];
            } else{
                texto = texto+bombs[i];
            }
        }
        label.setText(texto);

//        int cont1,cont2,atx;
//        for(cont1=0;cont1<10;cont1++){
//            for(cont2=0;cont2<9;cont2++){
//                if(bombs[cont2]>bombs[cont2+1]){
//                    atx=bombs[cont2];
//                    bombs[cont2]=bombs[cont2+1];
//                    bombs[cont2+1]=atx;
//                }
//            }
//        }

        
    }
    
    JLabel label = new JLabel();
    
    JButton btn = new JButton("Sorteio");
    
    public Ex1(){
        setSize(400,400);
        setVisible(true);
        setTitle("Loop - Mega Sena");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        label.setBounds(10,10,185,30);
        btn.setBounds(10,45,185,30);
        
        add(btn);
        add(label);
        
        btn.addActionListener(this);
    } 
    
    public static void main(String[] args) {
        new Ex1();
    }
}