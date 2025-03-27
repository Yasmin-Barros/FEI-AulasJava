/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07_ex07;

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

        // Criando um objeto Login com credenciais predefinidas
        Login login = new Login("admin", "1234");

        System.out.print("Usuário: ");
        String user = scanner.nextLine();

        System.out.print("Senha: ");
        String password = scanner.nextLine();

        try {
            login.logar(user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
}
