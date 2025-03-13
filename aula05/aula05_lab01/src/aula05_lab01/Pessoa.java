/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05_lab01;

/**
 *
 * @author unifybarros
 */
public class Pessoa{
    private String nome;
    private long cpf;
    private Data nascimento;

    public Pessoa(String nome, long cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + '}';
    }
    
    
}
