package tech.thiagohgcoutinho.app;

import tech.thiagohgcoutinho.pessoas.*;

import java.time.LocalDate;

public class AppMain {

    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        Cliente cliente01 = new Cliente();
        Funcionario funcionario01 = new Funcionario();

        cliente01.cadastrar("Thiago", LocalDate.parse("12/02/1986"), "Rua Antônio Vieira da Silva", "83991445979", "001", "Bombeiro Militar");

    }
}
