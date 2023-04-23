package com.br.dio.desafio.dominio;

public abstract class Conteudo {


    protected static final double XP_PADRAO = 10d;
    private String title;
    private String description;

    public Conteudo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract double calcularXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
