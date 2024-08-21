/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao41 {

    public static void resposta(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = (int) (Math.random() * 100);
        int count = 1;

        System.out.println("Descubra o número sorteado de 1 a 100");
        int valor = sc.nextInt();

        while (valor != numero) {
            System.out.println("Tente novamente");
            valor = sc.nextInt();
            count++;
        }

        System.out.println("Parabéns, você acertou o número em " + count + " tentativas");
    }
}
