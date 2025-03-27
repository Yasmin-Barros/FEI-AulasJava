
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author unifybarros
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um carro com velocidade máxima de 180 km/h
        Carro carro = new Carro(180);

        while (true) {
            System.out.println("\n1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            }

            System.out.print("Digite o valor: ");
            int valor = scanner.nextInt();

            try {
                if (opcao == 1) {
                    carro.acelerar(valor);
                } else if (opcao == 2) {
                    carro.frear(valor);
                } else {
                    System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
    
}
