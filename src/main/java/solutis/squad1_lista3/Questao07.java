/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import javax.swing.JOptionPane;

public class Questao07 {

    public static void resposta(String[] args) {

        String despesaStr = JOptionPane.showInputDialog("Digite o valor da despesa do cliente:");
        double despesa = Double.parseDouble(despesaStr);

        double comissao = despesa * 0.10;

        JOptionPane.showMessageDialog(null, "A comissão do garçom é: R$ " + String.format("%.2f", comissao));
    }
}
