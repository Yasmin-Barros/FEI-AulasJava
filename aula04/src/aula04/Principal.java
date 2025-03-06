/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

import java.util.ArrayList;

/**
 *
 * @author unifybarros
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>(); //Cria uma arraylist chamada clientes
        //ArrayList<contaCorrente> contas = new ArrayList<>();
        
        clientes.add(new Cliente("Yasmin", new contaCorrente(1)));
        System.out.println(Cliente.totalContas);
        clientes.add(new Cliente("João", 1));
        clientes.add(new Cliente("Kaio", 999));
        
        
        System.out.println(clientes);
        
        clientes.get(0).getConta().depositar(99);
        System.out.println(clientes);
        
        clientes.get(1).getConta().sacar(1);
        System.out.println(clientes);
        
        for(Cliente cliente:clientes){
            if(cliente.getNome().equals("Yasmin")){
                System.out.println("Saldo Yasmin: R$"+cliente.getConta().getSaldo());
            }
            else if(cliente.getNome().equals("João")){
                System.out.println("Saldo João: R$"+cliente.getConta().getSaldo()+"PobrEKKKKKKK");
            }
            
        }
        
        
        //NÃO SEI OQ TEM DE TÃO ERRADO 
        /*for(Cliente cliente:clientes){
            if(cliente.getNome().equals("Kaio")){
                clientes.remove(cliente);
                System.out.println(clientes);
            }
        }*/
        
        
        for(int index=0;index<clientes.size();index++){ 
            if(clientes.get(index).getNome().equalsIgnoreCase("Kaio")){
                clientes.remove(index);
                break; //Como eu acabei de remover um index tem q dar um break, pq senão vai ficar procurando esse index p smpre
            }
            System.out.println(clientes.get(index));
        }
        System.out.println(clientes);
        System.out.println(clientes.get(0).totalContas);
    }
}