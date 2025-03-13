/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author unifybarros
 */
public class Cliente {
    private String nome;
    private int contaID;
    public static int totalContas = 1; //Static é um atributo DA CLASSE
    private contaCorrente conta;

    public Cliente(String nome, contaCorrente conta) {
        this.nome = nome;
        this.contaID = this.totalContas;
        this.conta = conta;
        this.totalContas+=1;
    }
    
    
    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.contaID = this.totalContas;
        this.conta = new contaCorrente(saldo);
        this.totalContas+=1;
    }

    public String getNome() {
        return nome;
    }

    public int getContaID() {
        return contaID;
    }

    public contaCorrente getConta() {
        return conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContaID(int contaID) {
        this.contaID = contaID;
    }

    public void setConta(contaCorrente conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", contaID=" + contaID + ", conta=" + conta + '}';
    }
    
    
}
