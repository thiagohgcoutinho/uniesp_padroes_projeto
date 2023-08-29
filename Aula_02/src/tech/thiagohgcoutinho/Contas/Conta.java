package tech.thiagohgcoutinho.Contas;

public class Conta {

    int numero;
    String nome;
    double saldo;
    double limite;

    public Conta(){
        System.out.println("Conta vazia criada!");
    }

    public Conta(int numero, String nome, double saldo, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta(String nome) {
        this.nome = nome;
        this.numero = 4;
        this.limite = 3000;
        this.saldo = 1500;
    }

    void sacar (double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
}

