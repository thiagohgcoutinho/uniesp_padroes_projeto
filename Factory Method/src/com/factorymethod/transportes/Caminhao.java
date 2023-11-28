package com.factorymethod.transportes;

public class Caminhao extends Transporte {
    @Override
    public void criarTransporte() {
        System.out.println("Criando um caminhão para transporte.");
    }
}