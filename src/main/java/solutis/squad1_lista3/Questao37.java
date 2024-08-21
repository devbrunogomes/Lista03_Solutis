/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import javax.swing.JOptionPane;

public class Questao37 {

    public static void resposta(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Digite um número para calcular o fatorial:");
        int numero = Integer.parseInt(numeroStr);

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
    }
}
