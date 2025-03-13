/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05_ex01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifybarros
 */
public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        //Aluno aluno01 = new Aluno("CC","Yasmin","a", 1);
        
        System.out.println("Nome");
        String nome = input.next();
        System.out.println("soreNome");
        String sobrenome = input.next();
        System.out.println("idae");
        int idade = input.nextInt();
        System.out.println("curso");
        String curso = input.next();
        
        Aluno aluno = new Aluno(curso, nome, sobrenome, idade);
        alunos.add(new Aluno(curso, nome, sobrenome, idade));
        
        
        System.out.println(alunos);
    }
}
