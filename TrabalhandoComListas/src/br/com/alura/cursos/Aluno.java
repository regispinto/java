package br.com.alura.cursos;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser null");
        }

        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "[Aluno : " + this.nome + ", matricula: " + this.matricula + "]";
    }
}
