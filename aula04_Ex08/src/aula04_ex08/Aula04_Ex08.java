/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04_ex08;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author unifybarros
 */
public class Aula04_Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pessoa> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        while (continuar) {
            // Exibe o menu
            System.out.println("----------Menu Agenda----------\n"
                    + "n - Criar nova pessoa\n"
                    + "d - Deletar pessoa\n"
                    + "p - Imprimir toda a agenda\n"
                    + "q - Fechar programa");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "n":  // Criar nova pessoa
                    System.out.print("Entre com o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    System.out.print("Entre com o telefone da pessoa: ");
                    String telefone = scanner.nextLine();
                    
                    Pessoa novaPessoa = new Pessoa(nome, telefone);
                    agenda.add(novaPessoa);
                    break;  // Adicionado break para evitar a execução de outros cases

                case "d":  // Deletar pessoa
                    System.out.print("Nome da pessoa que deseja excluir: ");
                    nome = scanner.nextLine();
                    boolean pessoaDeletada = false;

                    for (Pessoa pessoa : agenda) {
                        if (pessoa.getNome().equals(nome)) {
                            agenda.remove(pessoa);
                            System.out.println(nome + " removido(a) da agenda.");
                            pessoaDeletada = true;
                            break;  // Encerra o loop quando a pessoa é encontrada
                        }
                    }

                    if (!pessoaDeletada) {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;  // Adicionado break para evitar a execução de outros cases

                case "p":  // Imprimir toda a agenda
                    if (agenda.isEmpty()) {
                        System.out.println("A agenda está vazia.");
                    } else {
                        System.out.println("Agenda:");
                        for (Pessoa pessoa : agenda) {
                            System.out.println("ID: " + pessoa.getIdPessoa() + ", Nome: " + pessoa.getNome() + ", Telefone: " + pessoa.getTelefone());
                        }
                    }
                    break;  // Adicionado break para evitar a execução de outros cases

                case "q":  // Fechar o programa
                    System.out.println("Até mais!!");
                    continuar = false;
                    scanner.close();
                    break;  // Adicionado break para sair do loop

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}