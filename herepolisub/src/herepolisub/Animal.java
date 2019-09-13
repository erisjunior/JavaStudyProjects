package herepolisub;

import javax.swing.JOptionPane;

public class Animal extends SerVivo{
    
    double peso;
    String nome;
    int idade; 
    String cor;
    String raca;
    String choo;
    
    
    String Comer(){
        return "Animal comendo...";
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getChoo() {
        return choo;
    }

    public void setChoo(String choo) {
        this.choo = choo;
    }
    
    
    
}
