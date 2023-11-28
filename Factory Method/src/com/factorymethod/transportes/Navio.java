package com.factorymethod.transportes;

public class Navio extends Transporte {
    @Override
    public void criarTransporte() {
        System.out.println("Criando um navio para transporte.");
    }
}