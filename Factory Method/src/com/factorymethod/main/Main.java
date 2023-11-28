package com.factorymethod.main;

import com.factorymethod.fabrica.TransporteFactory;
import com.factorymethod.transportes.Transporte;

public class Main {
    public static void main(String[] args) {
        TransporteFactory transporteFactory = new TransporteFactory();

        Transporte transporte1 = transporteFactory.getTransporte("AVIAO");
        transporte1.criarTransporte();

        Transporte transporte2 = transporteFactory.getTransporte("CAMINHAO");
        transporte2.criarTransporte();

        Transporte transporte3 = transporteFactory.getTransporte("NAVIO");
        transporte3.criarTransporte();
    }
}