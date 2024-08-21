/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao05 {
    public static void resposta(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- CÁLCULO DO VALOR FINAL DE UMA DÍVIDA! ----");
        System.out.println("Digite o valor inicial da dívida: ");
        double valorInicial = sc.nextDouble();
        System.out.println("Digite a quantidade de meses:");
        double qtdMeses = sc.nextDouble();
        System.out.println("Digite o valor dos juros mensais:");
        double juros = sc.nextDouble();

        calculoDivida(valorInicial, qtdMeses, juros);
    }

    private static void calculoDivida(double valorInicial, double qtdMeses, double juros) {
        //Fórmula juros simples:   M = C × ( 1 + i × t )

        double valorFinal = valorInicial + (valorInicial * juros/100 * qtdMeses);

        System.out.printf("Montante da dívida: %.2f", valorFinal);
    }
}
