package com.factorymethod.fabrica;

import com.factorymethod.transportes.Aviao;
import com.factorymethod.transportes.Caminhao;
import com.factorymethod.transportes.Navio;
import com.factorymethod.transportes.Transporte;

public class TransporteFactory {

    public Transporte getTransporte(String tipoTransporte) {
        if (tipoTransporte == null) {
            return null;
        }
        switch (tipoTransporte.toUpperCase()) {
            case "AVIAO":
                return new Aviao();
            case "CAMINHAO":
                return new Caminhao();
            case "NAVIO":
                return new Navio();
            default:
                return null;
        }
    }
}