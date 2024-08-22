
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao36 {

    public static void resposta(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        int inicio;
        int fim;
        inicio = Math.min(num1, num2);
        fim = Math.max(num1, num2);
        System.out.printf("Os numeros impares existentes entre %d e %d sao: ", inicio, fim);
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
