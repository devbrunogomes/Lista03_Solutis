/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

/*A partir da idade informada de um cidadão diga se ele
 não pode votar (idade inferior a 16), ou se o voto é 
 facultativo (idade menor ou igual a 16, ou maior ou igual a 65), 
ou ainda se o voto é obrigatório. */
import java.util.Scanner;

public class Questao11 {

    public static void resposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("Você não pode votar");
        } else if (age < 18 || age > 65) {
            System.out.println("Voto facultativo");

        } else {
            System.out.println("Voto Obrigatório");

        }
        scanner.close();

    }
}
