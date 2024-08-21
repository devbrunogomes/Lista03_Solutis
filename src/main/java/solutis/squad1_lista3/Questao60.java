/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import javax.swing.JOptionPane;

public class Questao60 {
     public static void resposta(String[] args) {
        String valorStr = JOptionPane.showInputDialog(null, "Digite o valor da dívida:");
        double valorDivida = Double.parseDouble(valorStr);

        String taxaStr = JOptionPane.showInputDialog(null, "Digite a taxa de correção mensal em %:");
        double taxaCorreção = Double.parseDouble(taxaStr) / 100;

        String anosStr = JOptionPane.showInputDialog(null, "Digite a quantidade de anos:");
        int anos = Integer.parseInt(anosStr);

        StringBuilder tabela = new StringBuilder();
        tabela.append(String.format("%-5s", "Anos"));

        for (int m = 1; m <= 12; m++) {
            tabela.append(String.format(" %4s", getNomeMes(m)));
        }
        tabela.append("\n");

        double valorAtual = valorDivida;
        int anoAtual = 2007;
        for (int a = 0; a < anos; a++) {
            tabela.append(String.format("%4d", anoAtual));

            for (int m = 1; m <= 12; m++) {
                valorAtual *= (1 + taxaCorreção);
                tabela.append(String.format(" %6.2f", valorAtual));
            }
            tabela.append("\n");
            anoAtual++;
        }

        JOptionPane.showMessageDialog(null, tabela.toString());
    }

    private static String getNomeMes(int mes) {
        switch (mes) {
            case 1: return "Jan";
            case 2: return "Fev";
            case 3: return "Mar";
            case 4: return "Abr";
            case 5: return "Mai";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Ago";
            case 9: return "Set";
            case 10: return "Out";
            case 11: return "Nov";
            case 12: return "Dez";
            default: return "";
        }
    }
}
