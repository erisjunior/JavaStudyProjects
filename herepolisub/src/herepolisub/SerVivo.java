package herepolisub;

import javax.swing.JOptionPane;

abstract class SerVivo {
    
    String especie;
    String classe;
    String reino;
     
    String Comer(){
        return "Ser Vivo comendo...";
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
    
    
    
}
