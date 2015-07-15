package model.arquiteturamvc;

public abstract class Conta {

    private double saldo;
    
    public boolean saque(double valor){
        this.saldo =- valor;
        return true;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }
}
