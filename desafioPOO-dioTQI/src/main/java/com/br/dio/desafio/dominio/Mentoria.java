package com.br.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String title;
    private String description;
    private LocalDate date;

    public Mentoria() {
    }
    public Mentoria(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria " +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date;

    }
}
