package org.example;

import com.br.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Conteudo curso1  = new Curso("Curso de java", "Version 17", 8);
        Conteudo curso2  = new Curso("Curso de Kotlin", "version 1.8", 18);
        Conteudo mentoria = new Mentoria("qualquer titulo", "uma ajuda aqui", LocalDate.now());
        //System.out.println(curso1);
        //System.out.println(mentoria);





        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudoInscrito());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudoConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setName("Joao");
        devJoao.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscrito());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscrito());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudoConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}