package caixaeletronico;

import javax.swing.JOptionPane;

public class Conta {
    
    private int conta;
    private String senha;
    private double saldo;
    private boolean a;

    public boolean getA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }
    
    Conta(int c, String s, double ss){
        this.conta =c;
        this.senha =s;
        this.saldo =ss;
    }

    public boolean Sacar(int valor){
        
        if(valor>this.saldo){
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
            this.a = false;
        }else{
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "SALDO"+this.saldo);
            this.a = true;
        }
        
        return a;
    }
    
    public void Trans(int cd, double v, int cc){
        //this.conta = 
    }
    
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}