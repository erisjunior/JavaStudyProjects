package herepolisub;

public class Pessoa extends SerVivo{

    private String nome;

    String Comer(){
        return "Pessoa comendo...";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
