/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04_ex08;
/**
 *
 * @author unifybarros
 */
public class Pessoa {
    private String nome;
    private String telefone;
    public static int IdPessoa = 1;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.IdPessoa = IdPessoa++;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public static int getIdPessoa() {
        return IdPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static void setIdPessoa(int IdPessoa) {
        Pessoa.IdPessoa = IdPessoa;
    }
    
    
}
