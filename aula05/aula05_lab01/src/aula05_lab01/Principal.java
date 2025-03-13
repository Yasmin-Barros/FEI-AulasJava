/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05_lab01;

import java.util.ArrayList;
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
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();
        
        for (int loop = 0; loop < 2; loop++) {
            System.out.println("\n=== Cadastro do Funcionário " + (loop + 1) + " ===");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            long cpf = scanner.nextLong();

            System.out.println("Data de nascimento (dia, mês, ano): ");
            int diaNasc = scanner.nextInt();
            int mesNasc = scanner.nextInt();
            int anoNasc = scanner.nextInt();
            Data nascimento = new Data(diaNasc, mesNasc, anoNasc);

            System.out.println("Data de admissão (dia, mês, ano): ");
            int diaAdm = scanner.nextInt();
            int mesAdm = scanner.nextInt();
            int anoAdm = scanner.nextInt();
            Data admissao = new Data(diaAdm, mesAdm, anoAdm);

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir quebra de linha

            // Criando e adicionando o funcionário à lista
            funcionarios.add(new Funcionario(nome, cpf, nascimento, admissao, salario));
        }
        
        
        funcionarios.add(new Funcionario("João Silva", 11111111111L, new Data(10, 5, 1990), new Data(1, 2, 2015), 5000.0));
        funcionarios.add(new Funcionario("Maria Santos", 22222222222L, new Data(20, 8, 1987), new Data(15, 3, 2018), 5500.0));
        funcionarios.add(new Funcionario("Carlos Pereira", 33333333333L, new Data(5, 12, 1995), new Data(20, 7, 2020), 4800.0));


        gerentes.add(new Gerente("Ana Souza", 44444444444L, new Data(15, 4, 1982), new Data(10, 6, 2008), 9500.0, 1, new Data(1, 1, 2019)));
        gerentes.add(new Gerente("Fernando Lima", 55555555555L, new Data(25, 9, 1978), new Data(5, 11, 2005), 12000.0, 2, new Data(3, 4, 2015)));

        
        System.out.println("==== LISTA DE FUNCIONÁRIOS ====");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
        
        System.out.println("\n==== LISTA DE GERENTES ====");
        for (Gerente g : gerentes) {
            System.out.println(g);
        }
    }  
}
