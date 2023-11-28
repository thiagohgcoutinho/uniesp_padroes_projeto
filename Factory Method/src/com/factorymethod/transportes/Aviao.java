package com.factorymethod.transportes;

public class Aviao extends Transporte {
    @Override
    public void criarTransporte() {
        System.out.println("Criando um avião para transporte.");
    }
}