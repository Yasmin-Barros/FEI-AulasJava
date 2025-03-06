/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04_ex07;

/**
 *
 * @author unifybarros
 */
public class Matematica {
    
    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static boolean impar(boolean x,boolean y, boolean z){
        int countImp = 0;
        
        if(x) countImp++; // Se for True
        if(y) countImp++;
        if(z) countImp++;
        
        
        return countImp % 2!=0; //Retorna True se o n de entradas for impar(1 ou 3 Trues)
    }
    
    //NÃO pode usar IF, por isso to usando o switch case
    public static boolean maioria(boolean x,boolean y, boolean z){
        
        //condição ? valor_se_verdadeiro : valor_se_falso;
        return (x ? 1 : 0) + (y ? 1 : 0) + (z ? 1 : 0) >= 2;
        // se x for True=1 + se y for false= 0 + se z for True=1, a soma deu 2
        //se a soma desse menos de 2, não retorna nada(false)
    }

}
