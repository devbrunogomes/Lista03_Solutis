
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao65 {

    public static void resposta(String[] args) {
        int linhas;
        int cont;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de linhas: ");
        linhas = scanner.nextInt();
        cont = linhas;
        for (int i = 0; i < linhas; i++) {
            cont--;
            if (i > 0) {
                cont = cont - 1;
            }
            for (int j = linhas - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < linhas - cont; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
