package tech.thiagohgcoutinho.Main;

import tech.thiagohgcoutinho.Entidades.Produtos;

public class Main {
    public static void main(String[] args) {
        Produtos produto = new Produtos(1, "Notebook", 3000.00, 10);

        System.out.println(produto); // Mostra as informações iniciais do produto

        produto.addEstoque(5);  // Adiciona 5 ao estoque

        System.out.println(produto); // Mostra informações após adição ao estoque

        produto.vender(3);  // Vende 3 unidades

        System.out.println(produto); // Mostra informações após venda

        System.out.printf("Valor Total em Estoque: R$ %.2f%n", produto.getValorTotal());
    }
}
