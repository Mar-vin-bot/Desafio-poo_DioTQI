package com.br.dio.desafio.dominio;

public class Curso extends Conteudo{

    private Integer cargaHoraria;



    public Curso(String title, String description, Integer cargaHoraria) {
        super(title, description);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria ;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso " +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", cargaHoraria=" + cargaHoraria;
    }
}
