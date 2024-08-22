/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

//Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
import java.util.Scanner;

public class Questao04 {

    public static double Media(double soma) {
        return soma / 4;
    }

    public static void resposta() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double n4 = scanner.nextDouble();
        double soma = n1 + n2 + n3 + n4;
        double media = Media(soma);
        System.out.printf("A média do  aluno é : %.2f %n ", media);

        scanner.close();

    }
}
