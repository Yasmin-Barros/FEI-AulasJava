import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author unifybarros
 */

public class CadastroUsuarios {
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static Usuario buscarUsuario(String cpf) {
    for (Usuario u : usuarios) {
        if (u.cpf.equals(cpf)) {
            return u;
        }
    }
    return null;
}
}


