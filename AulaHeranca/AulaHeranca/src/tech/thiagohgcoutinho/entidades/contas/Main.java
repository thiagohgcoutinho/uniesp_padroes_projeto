package tech.thiagohgcoutinho.entidades.contas;

public class Main {
    public static void main(String[] args) {
        ContaEspecial ce1 = new ContaEspecial(1, 10000, 100000);

        ce1.sacar(2500);

    }
}
