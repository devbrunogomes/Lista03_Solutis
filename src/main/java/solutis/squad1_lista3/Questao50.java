/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao50 {

    public static int fibonacci(int n) {
        if (n == 1) {

            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void resposta(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        System.out.printf("O %d termo da sequencia de fibonacci é: %d", num, fibonacci(num));
    }
}
