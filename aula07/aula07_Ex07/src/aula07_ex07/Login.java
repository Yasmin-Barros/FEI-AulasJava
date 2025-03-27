/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07_ex07;

/**
 *
 * @author unifybarros
 */
public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void logar(String user, String password) throws Exception {
        if (!this.usuario.equals(user) || !this.senha.equals(password)) {
            throw new Exception("Usuário ou senha incorretos!");
        }
        System.out.println("Login realizado com sucesso!");
    }
}

