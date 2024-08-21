/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import javax.swing.JOptionPane;


public class Questao02 {
    public static void resposta(String[] args) {
        String salarioStr = JOptionPane.showInputDialog("Digite o valor do seu salário:");
        double salario = Double.parseDouble(salarioStr);

        String salarioMinimoStr = JOptionPane.showInputDialog("Digite o valor do salário mínimo atual:");
        double salarioMinimo = Double.parseDouble(salarioMinimoStr);

        double quantidadeSalariosMinimos = salario / salarioMinimo;

        JOptionPane.showMessageDialog(null, "Você ganha " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}
