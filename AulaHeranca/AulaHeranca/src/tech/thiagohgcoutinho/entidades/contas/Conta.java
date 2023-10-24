package tech.thiagohgcoutinho.entidades.contas;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean depositar(double valor){
        this.saldo = this.saldo + valor;
        return true;
    }

    public boolean sacar(double valor){
        if (this.saldo > valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
}
