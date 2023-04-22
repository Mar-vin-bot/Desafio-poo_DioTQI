package org.example;

import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso("meu curso", "como ser eu", 32);
        Mentoria m1 = new Mentoria("to indo", "um dia apos o outro", LocalDate.now());
        System.out.println(c1.toString());
        System.out.println(m1.toString());
    }
}