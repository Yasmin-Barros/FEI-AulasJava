/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author unifybarros
 */
public class contaCorrente {
    private double saldo;
    
    public contaCorrente(){
        this.saldo = 0;
    }
    
    public contaCorrente(double saldo){
        this.saldo = saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    void sacar(double valor){
        if((this.saldo-valor)>=0){
            this.saldo-=valor;}
    }
    
    void depositar(double valor){
        this.saldo+=valor;
    }
    
    public String toString(){
        return "Saldo:" + saldo;
    }
}
