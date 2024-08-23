/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao56 {
    public static void resposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do candidato 1: ");
        String nome1 = scanner.nextLine();
        System.out.println("Digite o nome do candidato 2: ");
        String nome2 = scanner.nextLine();
        System.out.println("Digite o nome do candidato 3: ");
        String nome3 = scanner.nextLine();
        int qtdeVotos1 = 0;
        int qtdeVotos2 = 0;
        int qtdeVotos3 = 0;
        int qtdeVotosBranco = 0;
        int voto = 0;
        while (voto != -1) {
            System.out.printf("Votação:\n1 - %s\n2 - %s\n3 - %s\n0- Voto em branco", nome1, nome2, nome3);
            System.out.println("\nDigite -1 para encerrar a votação ");
            voto = scanner.nextInt();
            if (voto == 1) {
                qtdeVotos1++;
            } else if (voto == 2) {
                qtdeVotos2++;
            } else if (voto == 3) {
                qtdeVotos3++;
            } else if (voto == 0) {
                qtdeVotosBranco++;
            } else {
                System.out.printf("Numero inválido, vote novamente\n");
            }
        }
        int totalVotos = qtdeVotos1 + qtdeVotos2 + qtdeVotos3
                + qtdeVotosBranco;
        float percentualVotos1 = (float) qtdeVotos1
                / totalVotos * 100;
        float percentualVotos2 = (float) qtdeVotos2
                / totalVotos * 100;
        float percentualVotos3 = (float) qtdeVotos3
                / totalVotos * 100;
        float percentualVotosBranco = (float) qtdeVotosBranco
                / totalVotos * 100;
        System.out.printf("%s teve %.2f%% dos votos\n", nome1,
                percentualVotos1);
        System.out.printf("%s teve %.2f%% dos votos\n", nome2,
                percentualVotos2);
        System.out.printf("%s teve %.2f%% dos votos\n", nome3,
                percentualVotos3);
        System.out.printf("Percentual de votos em branco:%.2f%%\n", percentualVotosBranco);
        float maior = Math.max(percentualVotos1,
                Math.max(percentualVotos2, percentualVotos3));
        if (maior == percentualVotos1) {
            System.out.printf("O ganhador da eleição foi: %s\n",
                    nome1);
        } else if (maior == percentualVotos2) {
            System.out.printf("O ganhador da eleição foi: %s\n",
                    nome2);
        } else if (maior == percentualVotos3) {
            System.out.printf("O ganhador da eleição foi: %s\n",
                    nome3);
        }
    }
}
