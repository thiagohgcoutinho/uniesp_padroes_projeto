package tech.thiagohgcoutinho.Contas;

public class Main {

    public static void main(String[] args) {

        Conta conta2 = new Conta();

        conta2.nome = "Luiz";
        conta2.numero = 2;
        conta2.limite = 4000;
        conta2.saldo = 3000;

        Conta conta3 = new Conta(3, "Ângelo", 7000,10000);
    }
}
