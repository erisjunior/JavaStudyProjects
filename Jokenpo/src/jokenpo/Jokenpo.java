package jokenpo;
public class Jokenpo {

   
    public static void main(String[] args) {
        
        String Nomes [] = new String [5];
        Nomes [0] = "Manoel";
        Nomes [1] = "no3l";
        Nomes [2] = "Papai non30";
        Nomes [3] = "Mano EU";
        Nomes [4] = "Mano TU";
        
        
        int num = (int) (Math.random()*5);
        System.out.println(num+" = "+Nomes[num]);
        
    }
    
}
