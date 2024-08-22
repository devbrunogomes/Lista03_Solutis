package solutis.squad1_lista3;

import java.util.Random;

/**
 *
 * @author bsgom
 */
public class Questao34 {

    public static void resposta() {
        Random numeroAleatorio = new Random();

        System.out.println("== 50 Numeros Aleatorios entre 1 e 100: ==");

        for (int i = 1; i < 51; i++) {
            System.out.println("Numero " + i + ": " + (numeroAleatorio.nextInt(100) + 1));
        }

    }
}
