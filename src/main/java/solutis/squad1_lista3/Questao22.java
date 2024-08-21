/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import javax.swing.JOptionPane;

public class Questao22 {

    public static void resposta(String[] args) {
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da primeira data de aniversário:"));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da primeira data de aniversário:"));

        int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da segunda data de aniversário:"));
        int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês da segunda data de aniversário:"));

        if (dia1 == dia2 && mes1 == mes2) {
            JOptionPane.showMessageDialog(null, "As duas datas de aniversário são iguais.");
        } else {
            JOptionPane.showMessageDialog(null, "As duas datas de aniversário são diferentes.");
        }
    }
}
