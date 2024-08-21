/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutis.squad1_lista3;

import java.util.Scanner;

public class Questao48 {
    public static void resposta(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas =0;


        System.out.println("Digite quantas notas você precisa para o cálculo da média: ");
        int qtdNotas = sc.nextInt();

        for(int i = 1; i <= qtdNotas; i++){
            System.out.println("Digite a " + i + "ª nota: ");
            notas += sc.nextDouble();

        }

        System.out.println("Quantidade de aulas totais: ");
        int qtdAulas = sc.nextInt();
        System.out.println("Quantidade de faltas totais: ");
        int qtdFaltas = sc.nextInt();

        situacaoEstudante(notas, qtdNotas, qtdAulas, qtdFaltas);

    }

    private static void situacaoEstudante(double notas, int qtdNotas, int qtdAulas, int qtdFaltas) {
        if(calculaFaltas(qtdFaltas, qtdAulas) == false){
            return;
        };

        double media = notas/qtdNotas;

        if(media > 6){
            System.out.println("Aluno aprovado por média! " + media);
        }else{
            System.out.println("Aluno está reprovado por média! " + media);
        }
    }

    private static boolean calculaFaltas(int qtdFaltas, int qtdAulas) {
        double result = (double) qtdFaltas / qtdAulas;

        if (result > 0.25) {
            System.out.println("Aluno reprovado por falta, apenas obteve " + (100 - (result * 100)) + " de frequência!");
            return false;
        }else{
            return true;
        }
    }
}