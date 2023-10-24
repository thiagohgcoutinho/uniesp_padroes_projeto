package tech.thiagohgcoutinho.entidades.contas;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacar(double valor){
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - (valor * 0.90));
            return true;
        } else {
            return false;
        }
    }
}
