/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import javax.swing.JOptionPane;

public class Questao20 {
     public static void resposta(String[] args) {
    
        String nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa:");
        int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira pessoa:"));

        String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa:");
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda pessoa:"));

        if (idade1 > idade2) {
            JOptionPane.showMessageDialog(null, nome1 + " é mais velho(a) que " + nome2);
            JOptionPane.showMessageDialog(null, nome2 + " é mais novo(a) que " + nome1);
        } else if (idade2 > idade1) {
            JOptionPane.showMessageDialog(null, nome2 + " é mais velho(a) que " + nome1);
            JOptionPane.showMessageDialog(null, nome1 + " é mais novo(a) que " + nome2);
        } else {
            JOptionPane.showMessageDialog(null, nome1 + " e " + nome2 + " têm a mesma idade.");
        }
    }
}
