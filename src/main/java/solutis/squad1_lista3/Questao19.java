/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao19 {
    public static void resposta(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        if (valor1 == valor2){
            System.out.println("Os valores são iguais: " + valor1);
        }else if(valor1 < valor2){
            System.out.println(valor1 + "------" + valor2);
        } else{
            System.out.println(valor2 + "------" + valor1);
        }
    }
}
