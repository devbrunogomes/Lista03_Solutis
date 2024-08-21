/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Arrays;
import java.util.Scanner;

public class Questao28 {
    public static void resposta(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros =new int[3];

        System.out.println("Digite o 1º número: ");
        numeros[0] = sc.nextInt();
        System.out.println("Digite o 2º número: ");
        numeros[1] = sc.nextInt();
        System.out.println("Digite o 3º número: ");
        numeros[2] = sc.nextInt();

        Arrays.sort(numeros);

        for(int x : numeros){
            System.out.print(x + ", ");
        }
    }
}
