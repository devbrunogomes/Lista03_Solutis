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
public class Questao63 {

    public static void resposta() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int totalLinhas = scan.nextInt();
        int[] valores = new int[totalLinhas];
        int novoValor = 1;

        for (int i = 0; i < totalLinhas; i++) {
            valores[i] = novoValor;
            novoValor++;
            
            //Para iterar sobre cada item do array
            for (int item : valores) {
                if (item != 0) { //Pra nao iterar no valores iguais a 0
                    if (item < 10) {
                        //Formatacao de valores < 10
                        System.out.print("0" + item + " "); 
                    } else {
                        //Formatacao de valores > 10
                        System.out.print(item + " ");
                    }                    
                }
            }

            System.out.println(""); //Pular a linha
        }
    }
}
