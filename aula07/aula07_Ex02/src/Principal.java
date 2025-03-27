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
        Pessoa pessoa01 = null;
        
        try{
        System.out.println(pessoa01.toString());
        }catch(NullPointerException e){
            System.out.println("Erro! "+ e.getMessage());
        }
    }
    
}
