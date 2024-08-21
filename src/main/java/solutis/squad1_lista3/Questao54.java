/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao54 {

    public static void resposta(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----  TABELA DE CONVERSÃO   ------");

        System.out.println("Valor inicial: ");
        double valorInicio = sc.nextDouble();
        System.out.println("Valor final: ");
        double valorFinal = sc.nextDouble();
        System.out.println("Valor de incremento, (se '2.5' = 5 --> 7.5 --> 10)");
        double incremento = sc.nextDouble();
        System.out.println("Digite o valor do dólar");
        double dolar = sc.nextDouble();

        for (double i = valorInicio; i <= valorFinal; i += incremento) {
            System.out.printf("Valor em dólar: %.2f  ---   Valor em reais: %.2f\n", i, (i * dolar));

        }
    }
}
