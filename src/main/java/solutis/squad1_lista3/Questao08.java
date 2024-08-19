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
public class Questao08 {
   public static void resposta() {
        Scanner scan = new Scanner(System.in);
        int denominador = 0;
        
        //Entrada de valores
        System.out.print("Digite o Numerador: ");
        int numerador = scan.nextInt();

        System.out.print("Digite o Denominador: ");
        denominador = scan.nextInt();
        
        //Laço encerrado até o denominador ser diferente de 0
        do {
            System.out.println("Denominador nao pode ser igual a 0");
            System.out.print("Digite o Denominador: ");
            denominador = scan.nextInt();
        } while (denominador == 0);

        
        double numeroReal = (double) numerador / denominador; //Calculo
        
        //Saída
        System.out.println("=================");
        System.out.println("Numero real: " + numeroReal);
    } 
}
