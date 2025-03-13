/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05_lab01;

/**
 *
 * @author unifybarros
 */
public class Funcionario extends Pessoa{
    private Data admissao;
    private double salario;

    public Funcionario(String nome, long cpf, Data nascimento, Data admissao, double salario) {
        super(nome, cpf, nascimento); 
        this.admissao = admissao;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        return "Funcionario{" + "admissao=" + admissao + ", salario=" + salario + '}';
    }
    
    
}
