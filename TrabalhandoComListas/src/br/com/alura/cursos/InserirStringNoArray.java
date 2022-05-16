package br.com.alura.cursos;

import java.util.ArrayList;
import java.util.Collections;

public class InserirStringNoArray {
    public static void main(String[] args) {
        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add("Dominando Phyton");

        System.out.println(cursos);

        for (String curso: cursos) {
            System.out.println("Curso: " + curso);
        }

        String primeiroCurso = cursos.get(0);
        System.out.println("O primeiro curso é: " + primeiroCurso);

        cursos.forEach(curso -> {
            System.out.println("Percorrendo: ");
            System.out.println("Curso: " + curso);
        });

        Collections.sort(cursos);

        System.out.println("Depois de ordenado");
        System.out.println(cursos);

        cursos.remove(1);
        System.out.println("Curso 1 foi execluído");
        System.out.println(cursos);

        System.out.println(cursos);
    }
}
