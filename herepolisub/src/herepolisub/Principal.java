package herepolisub;

import javax.swing.JOptionPane;

public class Principal {
    
    static void AcaoComer(SerVivo ser){
        JOptionPane.showMessageDialog(null, ser.Comer());
    }
    
    public static void main(String[] args) {
        
        Animal a1 = new Animal();
        Pessoa p1 = new Pessoa();
        
//        a1.setReino("Animalia");
//        a1.setClasse("Mammalia");
//        a1.setEspecie("Penus enormus");
//        a1.setChoo("HerbaLife");
//        a1.setCor("Feia (Negro)");
//        a1.setIdade(2);
//        a1.setPeso(4);
//        a1.setRaca("PernaLonga");
//        a1.setNome("Velhinho");
        
        AcaoComer(a1);
        AcaoComer(p1);
    }
}
