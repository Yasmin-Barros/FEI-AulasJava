/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifybarros
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ExibirUsuario {
    public ExibirUsuario(ArrayList<Usuario> usuarios) {
        JFrame exibirFrame = new JFrame("Procurar usuário");
        exibirFrame.setSize(300, 200);
        exibirFrame.setLayout(new FlowLayout());

        JTextField cpfField = new JTextField(15);
        JButton buscarBtn = new JButton("Exibir");
        JTextArea resultadoArea = new JTextArea(5, 25);
        resultadoArea.setEditable(false);

        exibirFrame.add(new JLabel("Procurar usuário por CPF:"));
        exibirFrame.add(cpfField);
        exibirFrame.add(buscarBtn);
        exibirFrame.add(new JScrollPane(resultadoArea));

        buscarBtn.addActionListener(e -> {
            String cpf = cpfField.getText();
            for (Usuario u : usuarios) {
                if (u.cpf.equals(cpf)) {
                    resultadoArea.setText("Nome: " + u.nome + "\nSobrenome: " + u.sobrenome + "\nIdade: " + u.idade + "\nSexo: " + u.sexo);
                    return;
                }
            }
            resultadoArea.setText("Usuário não encontrado!");
        });

        exibirFrame.setVisible(true);
    }
}