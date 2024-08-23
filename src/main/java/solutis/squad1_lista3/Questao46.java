package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao46 {
    public static void resposta() {
        Scanner scanner = new Scanner(System.in);
        int homem = 0, mulher = 0, idade = 0;
        for (int i = 1; i <= 200; i++) {
            System.out.println("Idade:");
            idade = scanner.nextInt();
            System.out.println("Sexo (m/f):");
            String sexo = scanner.next();
            if (idade >= 18) {
                if (sexo.equalsIgnoreCase("m")) {
                    homem++;
                } else if (sexo.equalsIgnoreCase("f")) {
                    mulher++;
                } else {
                    System.out.println("Entrada invalida!");
                }
            }
        }
        System.out.println("Mulheres maiores de idade: " + mulher);
        System.out.println("Homens maiores de idade: " + homem);
    }
}
