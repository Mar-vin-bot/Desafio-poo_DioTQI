package com.br.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootCamp(Bootcamp obj){
        this.conteudoInscrito.addAll(obj.getConteudos());
        obj.getDevsInscrito().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo this.conteudoInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        }else{
            System.err.println("Você não esta matriculado em nenhum conteudo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudoConcluidos
                .stream()
                .mapToDouble(element -> element.calcularXP())
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudoInscrito, conteudoConcluidos);
    }
}
