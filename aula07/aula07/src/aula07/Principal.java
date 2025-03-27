/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author unifybarros
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            try{ // CÓDIGO QUE CONTÉM RISCO DE FALHA
                System.out.println("Digite um n:");
                int n1 = input.nextInt();
                System.out.println("Digite outro n:");
                int n2 = input.nextInt();

                int resposta = n1/n2;
                System.out.printf("Resposta = %d\n", resposta);
                break;
            }catch(ArithmeticException e){ //Catch - CÓDIGO PRA TRATAR UM EXCEÇÃO
                System.out.println("Ocorreu um erro: "+ e.getMessage());
                System.out.println("Digite novamente numeros válidos!");
            }catch(InputMismatchException e){
                System.out.println("Ocorreu um erro: "+ e);
                System.out.println("Digite apenas números!");
                input.next();
            }finally{ //É sempre executado, independente se deu erro ou n
                System.out.println("abluble");
            }
        }
        System.out.println("Fim do programa!");
    }
    
}
