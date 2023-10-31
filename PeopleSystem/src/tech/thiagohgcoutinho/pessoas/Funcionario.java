package tech.thiagohgcoutinho.pessoas;

public class Funcionario extends Pessoa{

    private int matricula;
    private String cargo;
    private double salario;
    private String dataAdmissao;

    public void reajustarSalario(double percentual){
        double acrescimo = (percentual/100) + 1;
        this.salario = this.salario * percentual;
    }

    public void promover(String novoCargo){
        this.cargo = novoCargo;
    }

}
