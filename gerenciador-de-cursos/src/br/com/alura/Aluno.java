package br.com.alura;

public class Aluno {

    private String nome;
    private int numeroMatriculo;

    public Aluno(String nome, int numeroMatriculo) {
        this.nome = nome;
        this.numeroMatriculo = numeroMatriculo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatriculo() {
        return numeroMatriculo;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatriculo + "]";
    }
}