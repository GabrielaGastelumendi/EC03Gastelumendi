package com.gastelumendi.ec03.model;

public class Entrada extends Platos {

    private String entradaName;
    public Entrada(String name, String imgUrl, String tipoName) {
        super(name, imgUrl);
        this.entradaName = tipoName;
    }

    public String getSagaName() {
        return entradaName;
    }

    public void setSagaName(String tipoName) {
        this.entradaName = tipoName;
    }
}
