/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04_ex07;

/**
 *
 * @author unifybarros
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1,b=4,c=100;
        System.out.println(Matematica.max3(a,b,c));
        
        //se o número de trues for impar retorna true
        boolean x = true, y = false, z = false;
        System.out.println(Matematica.impar(x,y,z));
        
        //se tiver pelo menos dois trues ele retorna true
        System.out.println(Matematica.maioria(x, y, z));
        
    }
    
}
