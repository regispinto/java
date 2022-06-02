package br.com.alura.cursos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        //Set<String> alunos = new HashSet<>();
        Collection<String> alunos = new HashSet<>();

        // HashSet = Tabela interna de espalhamento

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        // Sets não aceita elementos repetidos.
        alunos.add("Nico Steppat");

        // Set (Conjunto) não garante a mesma ordem de inserção dos elementos
        listaMatriculados(alunos);

        System.out.println("Total de Alunos: " + alunos.size());

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println("Paulo está matriculado: " + pauloEstaMatriculado);

        // Remove elemento do conjunto
        alunos.remove("Sergio Lopes");

        listaMatriculados(alunos);
    }

    public static void listaMatriculados(Collection alunos) {
        System.out.println("");

        // Em Set nao existe ordem dos elementos inseridos
        for (Object aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println("");

        // Forma mais "elegante" de listar o conjunto de alunos
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}