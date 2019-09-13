package questao7;

import javax.swing.JOptionPane;

public class TesteCirculo {
    public static void main (String [] args){
        Circulo bola = new Circulo();
        
        int a = 10;
        
        if(a<1){
            
        } else if(a>0){
        
        bola.setRaio(a);
        
        JOptionPane.showMessageDialog(null, ""+bola.getRaio());
        }
    }
    
}
