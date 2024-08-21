/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import javax.swing.JOptionPane;

public class Questao30 {

    public static void resposta(String[] args) {
        int x1_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o x do primeiro vértice do primeiro retângulo:"));
        int y1_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o y do primeiro vértice do primeiro retângulo:"));
        int x2_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o x do segundo vértice do primeiro retângulo:"));
        int y2_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o y do segundo vértice do primeiro retângulo:"));
        int x3_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o x do terceiro vértice do primeiro retângulo:"));
        int y3_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o y do terceiro vértice do primeiro retângulo:"));
        int x4_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o x do quarto vértice do primeiro retângulo:"));
        int y4_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o y do quarto vértice do primeiro retângulo:"));

        int x1_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o x do primeiro vértice do segundo retângulo:"));
        int y1_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o y do primeiro vértice do segundo retângulo:"));
        int x2_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o x do segundo vértice do segundo retângulo:"));
        int y2_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o y do segundo vértice do segundo retângulo:"));
        int x3_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o x do terceiro vértice do segundo retângulo:"));
        int y3_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o y do terceiro vértice do segundo retângulo:"));
        int x4_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o x do quarto vértice do segundo retângulo:"));
        int y4_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o y do quarto vértice do segundo retângulo:"));

        int xMin1 = Math.min(Math.min(x1_1, x2_1), Math.min(x3_1, x4_1));
        int yMin1 = Math.min(Math.min(y1_1, y2_1), Math.min(y3_1, y4_1));
        int xMax1 = Math.max(Math.max(x1_1, x2_1), Math.max(x3_1, x4_1));
        int yMax1 = Math.max(Math.max(y1_1, y2_1), Math.max(y3_1, y4_1));

        int xMin2 = Math.min(Math.min(x1_2, x2_2), Math.min(x3_2, x4_2));
        int yMin2 = Math.min(Math.min(y1_2, y2_2), Math.min(y3_2, y4_2));
        int xMax2 = Math.max(Math.max(x1_2, x2_2), Math.max(x3_2, x4_2));
        int yMax2 = Math.max(Math.max(y1_2, y2_2), Math.max(y3_2, y4_2));

        if (xMin1 > xMax2 || xMin2 > xMax1 || yMin1 > yMax2 || yMin2 > yMax1) {
            JOptionPane.showMessageDialog(null, "Os retângulos não se interceptam.");
        } else {
            JOptionPane.showMessageDialog(null, "Os retângulos se interceptam.");
        }
    }
}
