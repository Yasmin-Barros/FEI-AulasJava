/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifybarros
 */
public class Carro {
    private int velocidade;
    private int velocidadeMaxima;

    public Carro() {
        this.velocidade = 0;
        this.velocidadeMaxima = 200; // Valor padrão
    }

    public Carro(int velocidadeMaxima) {
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(int valor) throws Exception {
        if (velocidade + valor > velocidadeMaxima) {
            throw new Exception("Velocidade excede o limite máximo de " + velocidadeMaxima + " km/h!");
        }
        velocidade += valor;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    public void frear(int valor) throws Exception {
        if (velocidade - valor < 0) {
            throw new Exception("O carro não pode ter velocidade negativa!");
        }
        velocidade -= valor;
        System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
    }
}
