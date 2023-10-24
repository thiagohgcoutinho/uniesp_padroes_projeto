package tech.thiagohgcoutinho.Entidades;

public class Produtos {

    private int id;
    private String nome;
    private double preco;
    private int qtdEmEstoque;

    // Construtor
    public Produtos(int id, String nome, double preco, int qtdEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    // Método para adicionar ao estoque
    public void addEstoque(int qtd) {
        this.qtdEmEstoque += qtd;
    }

    // Método para vender produtos
    public void vender(int qtd) {
        if(qtd <= this.qtdEmEstoque) {
            this.qtdEmEstoque -= qtd;
        } else {
            System.out.println("Quantidade em estoque insuficiente.");
        }
    }

    // Método para obter valor total do estoque
    public double getValorTotal() {
        return this.preco * this.qtdEmEstoque;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Preço: R$ " + String.format("%.2f", preco) + ", Quantidade em Estoque: " + qtdEmEstoque;
    }
}
