/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

/**
 *
 * @author bsgom
 */
public class Questao51 {

    public static void resposta() {
        Scanner scan = new Scanner(System.in);

//        double antepenultimo = 1;
//        double penultimo = 1;
//        double ultimo = 2;
        double auxiliar;

        System.out.print("Quantos 'n' termos de Tribonacci devem ser exibidos? ");
        int nTermos = scan.nextInt();
        double[] numeros = new double[nTermos];

        for (int i = 0; i < nTermos; i++) {
            if (i == 0 || i == 1) {
                auxiliar = 1;

            } else if (i == 2) {
                auxiliar = 2;

            } else {
                auxiliar = numeros[i - 1] + numeros[i - 2] + numeros[i - 3];

            }
            numeros[i] = auxiliar;

            System.out.printf("%.0f \n", auxiliar);
        }
    }
}
