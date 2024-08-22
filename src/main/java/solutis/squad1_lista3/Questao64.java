/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao64 {

    public static void desenharTriangulos(int qtdeTriangulos) {
        for (int i = 1; i <= qtdeTriangulos; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void resposta(String[] args) {

        int qtdeTriangulos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de triangulos: ");
        qtdeTriangulos = scanner.nextInt();
        desenharTriangulos(qtdeTriangulos);
    }
}
