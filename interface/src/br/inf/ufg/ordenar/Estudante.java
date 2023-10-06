package br.inf.ufg.ordenar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Estudante {
	
	private String nome;
    private double nota;
    private int idade;

    public Estudante(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota: " + nota + ", Idade: " + idade;
    }

}
