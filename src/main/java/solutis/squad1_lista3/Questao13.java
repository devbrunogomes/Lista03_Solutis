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
public class Questao13 {
    static Scanner scan = new Scanner(System.in);
    public static void resposta() {
        
        
        //Entradas
        System.out.print("Digite a 1a nota: ");
        double notaUm = scan.nextDouble();
        
        System.out.print("Digite a 2a nota: ");
        double notaDois = scan.nextDouble();
        
        System.out.print("Digite a 3a nota: ");
        double notaTres = scan.nextDouble();
        
        //Calculo
        double media = (notaUm + notaDois + notaTres) / 3;
        
        //Saídas
        System.out.println("===================");
        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if (media >= 5) {
            System.out.println("Aluno em Prova final!");
            double[] notas = {notaUm, notaDois, notaTres};
            provaFinal(notas);
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }
    
    public static void provaFinal(double notas[]) {
        double somaAtualDeNotas = 0;
        
        for (double nota : notas) {
            somaAtualDeNotas+=nota;
        }
        System.out.println("===================");
        System.out.print("Insira a nota da Prova Final: ");
        double provaFinal = scan.nextDouble();
        
        double mediaFinal = (somaAtualDeNotas + provaFinal) / notas.length;
        
        if (mediaFinal >= 5) {
            System.out.println("Aluno Aprovado com Prova Final!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }
}
