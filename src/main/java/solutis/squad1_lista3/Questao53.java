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
public class Questao53 {

    public static void resposta() {
        Scanner scan = new Scanner(System.in);
        int resultado = 0; //para armazenar a multiplicacao
        
        int limiteMaximo = Integer.MAX_VALUE / 10; //Limite para uma multiplicacao segura

        System.out.print("Digite um numero para sua tabuada ser exibida: ");
        int numTabuada = scan.nextInt();

        if (numTabuada < limiteMaximo) {
            for (int i = 1; i <= 10; i++) {
                resultado = numTabuada * i;
                System.out.println(numTabuada + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Erro: O número inserido é muito grande para calcular a tabuada.");
        }

    }
}
