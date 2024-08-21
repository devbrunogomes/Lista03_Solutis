/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao27 {

    public static void resposta(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Todos os números são iguais.");
        } else {
            double maior = numero1;

            if (numero2 > maior) {
                maior = numero2;
            }

            if (numero3 > maior) {
                maior = numero3;
            }

            System.out.println("O maior número é: " + maior);
        }

        scanner.close();
    }
}
