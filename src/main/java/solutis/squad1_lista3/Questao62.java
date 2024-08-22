package solutis.squad1_lista3;

/*Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas */
import java.util.Scanner;

public class Questao62 {

    public static void resposta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int linhas = scanner.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }

        scanner.close();

    }

}
