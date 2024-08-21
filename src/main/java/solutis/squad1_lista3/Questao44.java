/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import javax.swing.JOptionPane;

public class Questao44 {

    public static void resposta(String[] args) {
        String quantidadeStr = JOptionPane.showInputDialog(null, "Digite a quantidade de valores:");
        int quantidade = Integer.parseInt(quantidadeStr);

        double soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            String valorStr = JOptionPane.showInputDialog(null, "Digite o valor " + i + ":");
            double valor = Double.parseDouble(valorStr);

            soma += valor;
        }

        double media = soma / quantidade;

        JOptionPane.showMessageDialog(null, "A média aritmética dos " + quantidade + " valores é " + media);
    }
}
