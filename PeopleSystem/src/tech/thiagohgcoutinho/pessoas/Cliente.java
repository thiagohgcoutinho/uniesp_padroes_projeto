package tech.thiagohgcoutinho.pessoas;

import java.time.LocalDate;

public class Cliente extends Pessoa{

    private String codigo;
    private String profissao;

    public void cadastrar(String nome, LocalDate dataNascimento, String endereco, String telsContato, String codigo, String profissao){
        setNome(nome);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
        setTelsContato(telsContato);
        this.codigo = codigo;
        this.profissao = profissao;
    }
}
