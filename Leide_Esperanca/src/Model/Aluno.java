/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Aluno {
    private int id;
    private String nome;
    private double nota;
    private double nota2;

    // Construtor vazio
    public Aluno() {
    }

    // Construtor com parâmetros
    public Aluno(int id, String nome, double nota, double nota2) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
        this.nota2 = nota2;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Aluno{" +
               "id=" + id +
               ", nome='" + nome + '\'' +
               ", nota=" + nota +
               ", nota2=" + nota2 +
               '}';
    }
}
