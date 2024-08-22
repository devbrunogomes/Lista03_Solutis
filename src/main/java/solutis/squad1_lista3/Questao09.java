/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

//Verifique se o usuário é maior de idade ou não.

import java.util.Scanner;

public class Questao09 {
    
    public static void resposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }
        scanner.close();
    }
    
}
