package solutis.squad1_lista3;

import java.util.Scanner;

/**
 *
 * @author bsgom
 */
public class Questao29 {

    public static void resposta() {
        Scanner scan = new Scanner(System.in);

        // Recebendo os dois pontos do retângulo
        System.out.print("Digite a coordenada X do ponto superior esquerdo (-> x1 <-, y1): ");
        int x1 = scan.nextInt();

        System.out.printf("Digite a coordenada Y do ponto superior esquerdo (%s , -> y1 <-): ", x1);
        int y1 = scan.nextInt();

        System.out.print("Digite a coordenada X do ponto inferior direito (-> x2 <- , y2): ");
        int x2 = scan.nextInt();

        System.out.printf("Digite a coordenada X do ponto inferior direito ( %s  , -> y2 <-): ", x2);
        int y2 = scan.nextInt();

        // Verificando a natureza do retângulo
        if (x1 == x2 && y1 == y2) {
            System.out.println("Os pontos formam um ponto.");
        } else if (x1 == x2) {
            System.out.println("Os pontos formam uma reta vertical.");
        } else if (y1 == y2) {
            System.out.println("Os pontos formam uma reta horizontal.");
        } else {
            System.out.println("Os pontos formam um retângulo.");
            // Calculando a área do retângulo
            int largura = Math.abs(x2 - x1);
            int altura = Math.abs(y1 - y2);
            int area = largura * altura;
            System.out.println("A área do retângulo é: " + area);

            // Recebendo outro ponto
            System.out.print("Digite a coordenada X de outro ponto (-> x <- , y): ");
            int x = scan.nextInt();

            System.out.printf("Digite a coordenada Y de outro ponto (%s , -> y <-): ", x);
            int y = scan.nextInt();

            // Determinando a posição do ponto em relação ao retângulo
            if (x < x1 && y > y1) {
                System.out.println("O ponto está acima e à esquerda.");
            } else if (x > x2 && y > y1) {
                System.out.println("O ponto está acima e à direita.");
            } else if (x > x2 && y < y2) {
                System.out.println("O ponto está embaixo e à direita.");
            } else if (x < x1 && y < y2) {
                System.out.println("O ponto está embaixo e à esquerda.");
            } else if (x < x1) {
                System.out.println("O ponto está à esquerda.");
            } else if (x > x2) {
                System.out.println("O ponto está à direita.");
            } else if (y > y1) {
                System.out.println("O ponto está acima.");
            } else if (y < y2) {
                System.out.println("O ponto está embaixo.");
            } else {
                System.out.println("O ponto está dentro do retângulo ou na linha do retângulo.");
            }
        }

        scan.close();
    }
}
