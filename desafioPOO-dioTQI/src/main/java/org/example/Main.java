package org.example;

import com.br.dio.desafio.dominio.Conteudo;
import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Conteudo curso1  = new Curso("Curso de java", "asdfcd", 8);
        Conteudo mentoria = new Mentoria("qualquer titulo", "uma ajuda aqui", LocalDate.now());
        System.out.println(curso1);
        System.out.println(mentoria);

    }
}