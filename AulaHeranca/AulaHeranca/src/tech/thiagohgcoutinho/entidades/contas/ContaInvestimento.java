package tech.thiagohgcoutinho.entidades.contas;

public class ContaInvestimento extends Conta{
    private double taxa;
    private int prazo;

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public boolean sacar(double valor){
        if (getSaldo() > valor) {
            setSaldo(getSaldo() - (valor * 0.99));
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor){
        return false;
    }

    public double aplicarRendimento(double taxa){
        return taxa;
    }
}
