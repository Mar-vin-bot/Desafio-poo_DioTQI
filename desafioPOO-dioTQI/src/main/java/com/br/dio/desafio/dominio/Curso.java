package com.br.dio.desafio.dominio;

public class Curso {

    private String title;
    private String description;
    private Integer cargaHoraria;

    public Curso(){
    }

    public Curso(String title, String description, Integer cargaHoraria) {
        this.title = title;
        this.description = description;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso " +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", cargaHoraria=" + cargaHoraria;
    }
}
