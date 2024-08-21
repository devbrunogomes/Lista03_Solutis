/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import javax.swing.JOptionPane;

public class Questao21 {
    public static void resposta(String[] args) {
        String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionário (Diretoria, Gerência, Operacional):");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));

        double emprestimo = 0;
        if (cargo.equalsIgnoreCase("Diretoria")) {
            emprestimo = salario * 0.30;
        } else if (cargo.equalsIgnoreCase("Gerência")) {
            emprestimo = salario * 0.25;
        } else if (cargo.equalsIgnoreCase("Operacional")) {
            emprestimo = salario * 0.20;
        } else {
            JOptionPane.showMessageDialog(null, "Cargo inválido.");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "O valor do empréstimo possível é: R$ " + emprestimo);
    }
}
