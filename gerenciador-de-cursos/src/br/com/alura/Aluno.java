package br.com.alura;

public class Aluno {

    private String nome;
    private int numeroMatriculo;

    public Aluno(String nome, int numeroMatriculo) {
        if(nome == null){
            throw  new NullPointerException("nome não pode ser null");
        }
        this.nome = nome;
        this.numeroMatriculo = numeroMatriculo;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatriculo;
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
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatriculo + "]";
    }
}