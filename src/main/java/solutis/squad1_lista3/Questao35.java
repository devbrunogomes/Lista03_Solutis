/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Random;
import javax.swing.JOptionPane;

public class Questao35 {

    public static void resposta(String[] args) {
        Random random = new Random();

        String quantidadeStr = JOptionPane.showInputDialog(null, "Digite a quantidade de números a serem sorteados:");
        int quantidade = Integer.parseInt(quantidadeStr);

        // Receber a faixa do sorteio
        String faixaMinStr = JOptionPane.showInputDialog(null, "Digite o valor mínimo da faixa:");
        int faixaMin = Integer.parseInt(faixaMinStr);
        String faixaMaxStr = JOptionPane.showInputDialog(null, "Digite o valor máximo da faixa:");
        int faixaMax = Integer.parseInt(faixaMaxStr);

        // Gerar e exibir os números sorteados
        StringBuilder resultado = new StringBuilder("Números sorteados:\n");
        for (int i = 0; i < quantidade; i++) {
            int numeroSorteado = random.nextInt(faixaMax - faixaMin + 1) + faixaMin;
            resultado.append(numeroSorteado).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
