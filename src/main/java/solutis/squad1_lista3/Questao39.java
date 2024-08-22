/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao39 {

    public static void resposta(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        ArrayList<Integer> divisores = new ArrayList<>();
        int soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisores.add(i);
            }

        }
        for (int divisor : divisores) {
            soma += divisor;
        }
        if (soma == num) {
            System.out.printf("%d é um número perfeito", num);
        } else {
            System.out.printf("%d não é um número perfeito", num);
        }
        scanner.close();
    }
}
