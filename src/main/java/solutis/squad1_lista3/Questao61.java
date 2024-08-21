/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao61 {
    public static void resposta(String[] args) {

        System.out.println("Determine a quantidade de linhas da pirâmide: ");
        int linhas = new Scanner(System.in).nextInt();

        for(int i = 0; i < linhas; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
