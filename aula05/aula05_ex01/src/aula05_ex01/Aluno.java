/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05_ex01;

/**
 *
 * @author unifybarros
 */
//HERANÇA tipo, a classe Aluno herdou as coisas de Pessoa!
public class Aluno extends Pessoa{ 
    private String curso;

    public Aluno(String curso, String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "curso=" + curso + super.toString() +'}';
    }
    
    
}
