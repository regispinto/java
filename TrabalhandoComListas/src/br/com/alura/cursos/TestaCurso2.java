package br.com.alura.cursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando Coleções", 24));

        // aulasImutaveis é uma espécie de "clone" da lista Aulas
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        // Utiliza o "clone" para ordenar a lista
        List<Aula> listaDeAulasClonadas = new ArrayList<>(aulasImutaveis);
        Collections.sort(listaDeAulasClonadas);
        System.out.println(listaDeAulasClonadas);

        System.out.println(javaColecoes.getTempoTotal());

        // mesmo método escrito de forma mais elegante
        System.out.println(javaColecoes.getTempoTotal1());

        System.out.println(javaColecoes);
    }
}
